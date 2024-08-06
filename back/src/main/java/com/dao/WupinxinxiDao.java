package com.dao;

import com.entity.WupinxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WupinxinxiVO;
import com.entity.view.WupinxinxiView;


/**
 * 物品信息
 * 
 * @author 
 * @email 
 * @date 2022-04-29 13:15:17
 */
public interface WupinxinxiDao extends BaseMapper<WupinxinxiEntity> {
	
	List<WupinxinxiVO> selectListVO(@Param("ew") Wrapper<WupinxinxiEntity> wrapper);
	
	WupinxinxiVO selectVO(@Param("ew") Wrapper<WupinxinxiEntity> wrapper);
	
	List<WupinxinxiView> selectListView(@Param("ew") Wrapper<WupinxinxiEntity> wrapper);

	List<WupinxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<WupinxinxiEntity> wrapper);
	
	WupinxinxiView selectView(@Param("ew") Wrapper<WupinxinxiEntity> wrapper);
	

}
