package com.dao;

import com.entity.ShequhuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShequhuodongVO;
import com.entity.view.ShequhuodongView;


/**
 * 社区活动
 * 
 * @author 
 * @email 
 * @date 2022-04-29 13:15:18
 */
public interface ShequhuodongDao extends BaseMapper<ShequhuodongEntity> {
	
	List<ShequhuodongVO> selectListVO(@Param("ew") Wrapper<ShequhuodongEntity> wrapper);
	
	ShequhuodongVO selectVO(@Param("ew") Wrapper<ShequhuodongEntity> wrapper);
	
	List<ShequhuodongView> selectListView(@Param("ew") Wrapper<ShequhuodongEntity> wrapper);

	List<ShequhuodongView> selectListView(Pagination page,@Param("ew") Wrapper<ShequhuodongEntity> wrapper);
	
	ShequhuodongView selectView(@Param("ew") Wrapper<ShequhuodongEntity> wrapper);
	

}
