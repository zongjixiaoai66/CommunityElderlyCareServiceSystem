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


import com.dao.DiscussshequfuwuDao;
import com.entity.DiscussshequfuwuEntity;
import com.service.DiscussshequfuwuService;
import com.entity.vo.DiscussshequfuwuVO;
import com.entity.view.DiscussshequfuwuView;

@Service("discussshequfuwuService")
public class DiscussshequfuwuServiceImpl extends ServiceImpl<DiscussshequfuwuDao, DiscussshequfuwuEntity> implements DiscussshequfuwuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshequfuwuEntity> page = this.selectPage(
                new Query<DiscussshequfuwuEntity>(params).getPage(),
                new EntityWrapper<DiscussshequfuwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshequfuwuEntity> wrapper) {
		  Page<DiscussshequfuwuView> page =new Query<DiscussshequfuwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussshequfuwuVO> selectListVO(Wrapper<DiscussshequfuwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshequfuwuVO selectVO(Wrapper<DiscussshequfuwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshequfuwuView> selectListView(Wrapper<DiscussshequfuwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshequfuwuView selectView(Wrapper<DiscussshequfuwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
