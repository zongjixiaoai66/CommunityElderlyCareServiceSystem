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


import com.dao.ShequfuwuDao;
import com.entity.ShequfuwuEntity;
import com.service.ShequfuwuService;
import com.entity.vo.ShequfuwuVO;
import com.entity.view.ShequfuwuView;

@Service("shequfuwuService")
public class ShequfuwuServiceImpl extends ServiceImpl<ShequfuwuDao, ShequfuwuEntity> implements ShequfuwuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShequfuwuEntity> page = this.selectPage(
                new Query<ShequfuwuEntity>(params).getPage(),
                new EntityWrapper<ShequfuwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShequfuwuEntity> wrapper) {
		  Page<ShequfuwuView> page =new Query<ShequfuwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShequfuwuVO> selectListVO(Wrapper<ShequfuwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShequfuwuVO selectVO(Wrapper<ShequfuwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShequfuwuView> selectListView(Wrapper<ShequfuwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShequfuwuView selectView(Wrapper<ShequfuwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
