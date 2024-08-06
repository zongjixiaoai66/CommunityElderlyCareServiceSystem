package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ZixunzhongxinEntity;
import com.entity.view.ZixunzhongxinView;

import com.service.ZixunzhongxinService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 资讯中心
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-29 13:15:18
 */
@RestController
@RequestMapping("/zixunzhongxin")
public class ZixunzhongxinController {
    @Autowired
    private ZixunzhongxinService zixunzhongxinService;

    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZixunzhongxinEntity zixunzhongxin,
		HttpServletRequest request){
        EntityWrapper<ZixunzhongxinEntity> ew = new EntityWrapper<ZixunzhongxinEntity>();
		PageUtils page = zixunzhongxinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zixunzhongxin), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZixunzhongxinEntity zixunzhongxin, 
		HttpServletRequest request){
        EntityWrapper<ZixunzhongxinEntity> ew = new EntityWrapper<ZixunzhongxinEntity>();
		PageUtils page = zixunzhongxinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zixunzhongxin), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZixunzhongxinEntity zixunzhongxin){
       	EntityWrapper<ZixunzhongxinEntity> ew = new EntityWrapper<ZixunzhongxinEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zixunzhongxin, "zixunzhongxin")); 
        return R.ok().put("data", zixunzhongxinService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZixunzhongxinEntity zixunzhongxin){
        EntityWrapper< ZixunzhongxinEntity> ew = new EntityWrapper< ZixunzhongxinEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zixunzhongxin, "zixunzhongxin")); 
		ZixunzhongxinView zixunzhongxinView =  zixunzhongxinService.selectView(ew);
		return R.ok("查询资讯中心成功").put("data", zixunzhongxinView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZixunzhongxinEntity zixunzhongxin = zixunzhongxinService.selectById(id);
        return R.ok().put("data", zixunzhongxin);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZixunzhongxinEntity zixunzhongxin = zixunzhongxinService.selectById(id);
        return R.ok().put("data", zixunzhongxin);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZixunzhongxinEntity zixunzhongxin, HttpServletRequest request){
    	zixunzhongxin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zixunzhongxin);
        zixunzhongxinService.insert(zixunzhongxin);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZixunzhongxinEntity zixunzhongxin, HttpServletRequest request){
    	zixunzhongxin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zixunzhongxin);
        zixunzhongxinService.insert(zixunzhongxin);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ZixunzhongxinEntity zixunzhongxin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zixunzhongxin);
        zixunzhongxinService.updateById(zixunzhongxin);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zixunzhongxinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ZixunzhongxinEntity> wrapper = new EntityWrapper<ZixunzhongxinEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = zixunzhongxinService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
