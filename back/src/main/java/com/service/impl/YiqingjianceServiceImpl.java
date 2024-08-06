package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YiqingjianceDao;
import com.entity.YiqingjianceEntity;
import com.service.YiqingjianceService;
import com.entity.vo.YiqingjianceVO;
import com.entity.view.YiqingjianceView;

@Service("yiqingjianceService")
public class YiqingjianceServiceImpl extends ServiceImpl<YiqingjianceDao, YiqingjianceEntity> implements YiqingjianceService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YiqingjianceEntity> page = this.selectPage(
                new Query<YiqingjianceEntity>(params).getPage(),
                new EntityWrapper<YiqingjianceEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YiqingjianceEntity> wrapper) {
		  Page<YiqingjianceView> page =new Query<YiqingjianceView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YiqingjianceVO> selectListVO(Wrapper<YiqingjianceEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YiqingjianceVO selectVO(Wrapper<YiqingjianceEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YiqingjianceView> selectListView(Wrapper<YiqingjianceEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YiqingjianceView selectView(Wrapper<YiqingjianceEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
