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


import com.dao.ZixunzhongxinDao;
import com.entity.ZixunzhongxinEntity;
import com.service.ZixunzhongxinService;
import com.entity.vo.ZixunzhongxinVO;
import com.entity.view.ZixunzhongxinView;

@Service("zixunzhongxinService")
public class ZixunzhongxinServiceImpl extends ServiceImpl<ZixunzhongxinDao, ZixunzhongxinEntity> implements ZixunzhongxinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZixunzhongxinEntity> page = this.selectPage(
                new Query<ZixunzhongxinEntity>(params).getPage(),
                new EntityWrapper<ZixunzhongxinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZixunzhongxinEntity> wrapper) {
		  Page<ZixunzhongxinView> page =new Query<ZixunzhongxinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZixunzhongxinVO> selectListVO(Wrapper<ZixunzhongxinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZixunzhongxinVO selectVO(Wrapper<ZixunzhongxinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZixunzhongxinView> selectListView(Wrapper<ZixunzhongxinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZixunzhongxinView selectView(Wrapper<ZixunzhongxinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
