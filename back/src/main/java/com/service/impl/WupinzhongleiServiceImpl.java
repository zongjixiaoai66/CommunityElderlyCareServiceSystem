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


import com.dao.WupinzhongleiDao;
import com.entity.WupinzhongleiEntity;
import com.service.WupinzhongleiService;
import com.entity.vo.WupinzhongleiVO;
import com.entity.view.WupinzhongleiView;

@Service("wupinzhongleiService")
public class WupinzhongleiServiceImpl extends ServiceImpl<WupinzhongleiDao, WupinzhongleiEntity> implements WupinzhongleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WupinzhongleiEntity> page = this.selectPage(
                new Query<WupinzhongleiEntity>(params).getPage(),
                new EntityWrapper<WupinzhongleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WupinzhongleiEntity> wrapper) {
		  Page<WupinzhongleiView> page =new Query<WupinzhongleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WupinzhongleiVO> selectListVO(Wrapper<WupinzhongleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WupinzhongleiVO selectVO(Wrapper<WupinzhongleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WupinzhongleiView> selectListView(Wrapper<WupinzhongleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WupinzhongleiView selectView(Wrapper<WupinzhongleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
