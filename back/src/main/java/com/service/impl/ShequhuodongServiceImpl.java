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


import com.dao.ShequhuodongDao;
import com.entity.ShequhuodongEntity;
import com.service.ShequhuodongService;
import com.entity.vo.ShequhuodongVO;
import com.entity.view.ShequhuodongView;

@Service("shequhuodongService")
public class ShequhuodongServiceImpl extends ServiceImpl<ShequhuodongDao, ShequhuodongEntity> implements ShequhuodongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShequhuodongEntity> page = this.selectPage(
                new Query<ShequhuodongEntity>(params).getPage(),
                new EntityWrapper<ShequhuodongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShequhuodongEntity> wrapper) {
		  Page<ShequhuodongView> page =new Query<ShequhuodongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShequhuodongVO> selectListVO(Wrapper<ShequhuodongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShequhuodongVO selectVO(Wrapper<ShequhuodongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShequhuodongView> selectListView(Wrapper<ShequhuodongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShequhuodongView selectView(Wrapper<ShequhuodongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
