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

import com.entity.YiqingjianceEntity;
import com.entity.view.YiqingjianceView;

import com.service.YiqingjianceService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 疫情监测
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-29 13:15:18
 */
@RestController
@RequestMapping("/yiqingjiance")
public class YiqingjianceController {
    @Autowired
    private YiqingjianceService yiqingjianceService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YiqingjianceEntity yiqingjiance,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date dakashijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date dakashijianend,
		HttpServletRequest request){
    	if(!request.getSession().getAttribute("role").toString().equals("管理员")) {
    		yiqingjiance.setUserid((Long)request.getSession().getAttribute("userId"));
    	}
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			yiqingjiance.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YiqingjianceEntity> ew = new EntityWrapper<YiqingjianceEntity>();
                if(dakashijianstart!=null) ew.ge("dakashijian", dakashijianstart);
                if(dakashijianend!=null) ew.le("dakashijian", dakashijianend);
		PageUtils page = yiqingjianceService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yiqingjiance), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YiqingjianceEntity yiqingjiance, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date dakashijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date dakashijianend,
		HttpServletRequest request){
        EntityWrapper<YiqingjianceEntity> ew = new EntityWrapper<YiqingjianceEntity>();
                if(dakashijianstart!=null) ew.ge("dakashijian", dakashijianstart);
                if(dakashijianend!=null) ew.le("dakashijian", dakashijianend);
		PageUtils page = yiqingjianceService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yiqingjiance), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YiqingjianceEntity yiqingjiance){
       	EntityWrapper<YiqingjianceEntity> ew = new EntityWrapper<YiqingjianceEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yiqingjiance, "yiqingjiance")); 
        return R.ok().put("data", yiqingjianceService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YiqingjianceEntity yiqingjiance){
        EntityWrapper< YiqingjianceEntity> ew = new EntityWrapper< YiqingjianceEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yiqingjiance, "yiqingjiance")); 
		YiqingjianceView yiqingjianceView =  yiqingjianceService.selectView(ew);
		return R.ok("查询疫情监测成功").put("data", yiqingjianceView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YiqingjianceEntity yiqingjiance = yiqingjianceService.selectById(id);
        return R.ok().put("data", yiqingjiance);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YiqingjianceEntity yiqingjiance = yiqingjianceService.selectById(id);
        return R.ok().put("data", yiqingjiance);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YiqingjianceEntity yiqingjiance, HttpServletRequest request){
    	yiqingjiance.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yiqingjiance);
    	yiqingjiance.setUserid((Long)request.getSession().getAttribute("userId"));
        yiqingjianceService.insert(yiqingjiance);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YiqingjianceEntity yiqingjiance, HttpServletRequest request){
    	yiqingjiance.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yiqingjiance);
        yiqingjianceService.insert(yiqingjiance);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YiqingjianceEntity yiqingjiance, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yiqingjiance);
        yiqingjianceService.updateById(yiqingjiance);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yiqingjianceService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<YiqingjianceEntity> wrapper = new EntityWrapper<YiqingjianceEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}
		if(!request.getSession().getAttribute("role").toString().equals("管理员")) {
    		wrapper.eq("userid", (Long)request.getSession().getAttribute("userId"));
    	}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = yiqingjianceService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
