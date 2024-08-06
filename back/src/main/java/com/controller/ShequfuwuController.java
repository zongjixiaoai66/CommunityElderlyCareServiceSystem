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

import com.entity.ShequfuwuEntity;
import com.entity.view.ShequfuwuView;

import com.service.ShequfuwuService;
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
 * 社区服务
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-29 13:15:17
 */
@RestController
@RequestMapping("/shequfuwu")
public class ShequfuwuController {
    @Autowired
    private ShequfuwuService shequfuwuService;

    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShequfuwuEntity shequfuwu,
		HttpServletRequest request){
        EntityWrapper<ShequfuwuEntity> ew = new EntityWrapper<ShequfuwuEntity>();
		PageUtils page = shequfuwuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shequfuwu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShequfuwuEntity shequfuwu, 
		HttpServletRequest request){
        EntityWrapper<ShequfuwuEntity> ew = new EntityWrapper<ShequfuwuEntity>();
		PageUtils page = shequfuwuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shequfuwu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShequfuwuEntity shequfuwu){
       	EntityWrapper<ShequfuwuEntity> ew = new EntityWrapper<ShequfuwuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shequfuwu, "shequfuwu")); 
        return R.ok().put("data", shequfuwuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShequfuwuEntity shequfuwu){
        EntityWrapper< ShequfuwuEntity> ew = new EntityWrapper< ShequfuwuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shequfuwu, "shequfuwu")); 
		ShequfuwuView shequfuwuView =  shequfuwuService.selectView(ew);
		return R.ok("查询社区服务成功").put("data", shequfuwuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShequfuwuEntity shequfuwu = shequfuwuService.selectById(id);
		shequfuwu.setClicknum(shequfuwu.getClicknum()+1);
		shequfuwu.setClicktime(new Date());
		shequfuwuService.updateById(shequfuwu);
        return R.ok().put("data", shequfuwu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShequfuwuEntity shequfuwu = shequfuwuService.selectById(id);
		shequfuwu.setClicknum(shequfuwu.getClicknum()+1);
		shequfuwu.setClicktime(new Date());
		shequfuwuService.updateById(shequfuwu);
        return R.ok().put("data", shequfuwu);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        ShequfuwuEntity shequfuwu = shequfuwuService.selectById(id);
        if(type.equals("1")) {
        	shequfuwu.setThumbsupnum(shequfuwu.getThumbsupnum()+1);
        } else {
        	shequfuwu.setCrazilynum(shequfuwu.getCrazilynum()+1);
        }
        shequfuwuService.updateById(shequfuwu);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShequfuwuEntity shequfuwu, HttpServletRequest request){
    	shequfuwu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shequfuwu);
        shequfuwuService.insert(shequfuwu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShequfuwuEntity shequfuwu, HttpServletRequest request){
    	shequfuwu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shequfuwu);
        shequfuwuService.insert(shequfuwu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShequfuwuEntity shequfuwu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shequfuwu);
        shequfuwuService.updateById(shequfuwu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shequfuwuService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ShequfuwuEntity> wrapper = new EntityWrapper<ShequfuwuEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = shequfuwuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,ShequfuwuEntity shequfuwu, HttpServletRequest request,String pre){
        EntityWrapper<ShequfuwuEntity> ew = new EntityWrapper<ShequfuwuEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        params.put("order", "desc");
		PageUtils page = shequfuwuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shequfuwu), params), params));
        return R.ok().put("data", page);
    }


    /**
     * 协同算法（按收藏推荐）
     */
    @RequestMapping("/autoSort2")
    public R autoSort2(@RequestParam Map<String, Object> params,ShequfuwuEntity shequfuwu, HttpServletRequest request){
        String userId = request.getSession().getAttribute("userId").toString();
        String inteltypeColumn = "fuwuzhonglei";
        List<StoreupEntity> storeups = storeupService.selectList(new EntityWrapper<StoreupEntity>().eq("type", 1).eq("userid", userId).eq("tablename", "shequfuwu").orderBy("addtime", false));
        List<String> inteltypes = new ArrayList<String>();
        Integer limit = params.get("limit")==null?10:Integer.parseInt(params.get("limit").toString());
        List<ShequfuwuEntity> shequfuwuList = new ArrayList<ShequfuwuEntity>();
        //去重
        if(storeups!=null && storeups.size()>0) {
            for(StoreupEntity s : storeups) {
                shequfuwuList.addAll(shequfuwuService.selectList(new EntityWrapper<ShequfuwuEntity>().eq(inteltypeColumn, s.getInteltype())));
            }
        }
        EntityWrapper<ShequfuwuEntity> ew = new EntityWrapper<ShequfuwuEntity>();
        params.put("sort", "id");
        params.put("order", "desc");
        PageUtils page = shequfuwuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shequfuwu), params), params));
        List<ShequfuwuEntity> pageList = (List<ShequfuwuEntity>)page.getList();
        if(shequfuwuList.size()<limit) {
            int toAddNum = (limit-shequfuwuList.size())<=pageList.size()?(limit-shequfuwuList.size()):pageList.size();
            for(ShequfuwuEntity o1 : pageList) {
                boolean addFlag = true;
                for(ShequfuwuEntity o2 : shequfuwuList) {
                    if(o1.getId().intValue()==o2.getId().intValue()) {
                        addFlag = false;
                        break;
                    }
                }
                if(addFlag) {
                    shequfuwuList.add(o1);
                    if(--toAddNum==0) break;
                }
            }
        } else if(shequfuwuList.size()>limit) {
            shequfuwuList = shequfuwuList.subList(0, limit);
        }
        page.setList(shequfuwuList);
        return R.ok().put("data", page);
    }





}
