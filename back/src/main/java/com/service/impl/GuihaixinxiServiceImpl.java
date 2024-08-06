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


import com.dao.GuihaixinxiDao;
import com.entity.GuihaixinxiEntity;
import com.service.GuihaixinxiService;
import com.entity.vo.GuihaixinxiVO;
import com.entity.view.GuihaixinxiView;

@Service("guihaixinxiService")
public class GuihaixinxiServiceImpl extends ServiceImpl<GuihaixinxiDao, GuihaixinxiEntity> implements GuihaixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuihaixinxiEntity> page = this.selectPage(
                new Query<GuihaixinxiEntity>(params).getPage(),
                new EntityWrapper<GuihaixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GuihaixinxiEntity> wrapper) {
		  Page<GuihaixinxiView> page =new Query<GuihaixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GuihaixinxiVO> selectListVO(Wrapper<GuihaixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GuihaixinxiVO selectVO(Wrapper<GuihaixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GuihaixinxiView> selectListView(Wrapper<GuihaixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GuihaixinxiView selectView(Wrapper<GuihaixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
