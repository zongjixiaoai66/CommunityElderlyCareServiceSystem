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


import com.dao.FuwuzhongleiDao;
import com.entity.FuwuzhongleiEntity;
import com.service.FuwuzhongleiService;
import com.entity.vo.FuwuzhongleiVO;
import com.entity.view.FuwuzhongleiView;

@Service("fuwuzhongleiService")
public class FuwuzhongleiServiceImpl extends ServiceImpl<FuwuzhongleiDao, FuwuzhongleiEntity> implements FuwuzhongleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FuwuzhongleiEntity> page = this.selectPage(
                new Query<FuwuzhongleiEntity>(params).getPage(),
                new EntityWrapper<FuwuzhongleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FuwuzhongleiEntity> wrapper) {
		  Page<FuwuzhongleiView> page =new Query<FuwuzhongleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FuwuzhongleiVO> selectListVO(Wrapper<FuwuzhongleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FuwuzhongleiVO selectVO(Wrapper<FuwuzhongleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FuwuzhongleiView> selectListView(Wrapper<FuwuzhongleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FuwuzhongleiView selectView(Wrapper<FuwuzhongleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
