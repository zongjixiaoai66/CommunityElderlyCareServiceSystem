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


import com.dao.DiscusszixunzhongxinDao;
import com.entity.DiscusszixunzhongxinEntity;
import com.service.DiscusszixunzhongxinService;
import com.entity.vo.DiscusszixunzhongxinVO;
import com.entity.view.DiscusszixunzhongxinView;

@Service("discusszixunzhongxinService")
public class DiscusszixunzhongxinServiceImpl extends ServiceImpl<DiscusszixunzhongxinDao, DiscusszixunzhongxinEntity> implements DiscusszixunzhongxinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszixunzhongxinEntity> page = this.selectPage(
                new Query<DiscusszixunzhongxinEntity>(params).getPage(),
                new EntityWrapper<DiscusszixunzhongxinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszixunzhongxinEntity> wrapper) {
		  Page<DiscusszixunzhongxinView> page =new Query<DiscusszixunzhongxinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusszixunzhongxinVO> selectListVO(Wrapper<DiscusszixunzhongxinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszixunzhongxinVO selectVO(Wrapper<DiscusszixunzhongxinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszixunzhongxinView> selectListView(Wrapper<DiscusszixunzhongxinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszixunzhongxinView selectView(Wrapper<DiscusszixunzhongxinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
