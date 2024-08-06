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


import com.dao.WuyeshoufeiDao;
import com.entity.WuyeshoufeiEntity;
import com.service.WuyeshoufeiService;
import com.entity.vo.WuyeshoufeiVO;
import com.entity.view.WuyeshoufeiView;

@Service("wuyeshoufeiService")
public class WuyeshoufeiServiceImpl extends ServiceImpl<WuyeshoufeiDao, WuyeshoufeiEntity> implements WuyeshoufeiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WuyeshoufeiEntity> page = this.selectPage(
                new Query<WuyeshoufeiEntity>(params).getPage(),
                new EntityWrapper<WuyeshoufeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WuyeshoufeiEntity> wrapper) {
		  Page<WuyeshoufeiView> page =new Query<WuyeshoufeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WuyeshoufeiVO> selectListVO(Wrapper<WuyeshoufeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WuyeshoufeiVO selectVO(Wrapper<WuyeshoufeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WuyeshoufeiView> selectListView(Wrapper<WuyeshoufeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WuyeshoufeiView selectView(Wrapper<WuyeshoufeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<WuyeshoufeiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<WuyeshoufeiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<WuyeshoufeiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
