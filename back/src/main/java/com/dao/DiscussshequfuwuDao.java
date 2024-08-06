package com.dao;

import com.entity.DiscussshequfuwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshequfuwuVO;
import com.entity.view.DiscussshequfuwuView;


/**
 * 社区服务评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-29 13:15:18
 */
public interface DiscussshequfuwuDao extends BaseMapper<DiscussshequfuwuEntity> {
	
	List<DiscussshequfuwuVO> selectListVO(@Param("ew") Wrapper<DiscussshequfuwuEntity> wrapper);
	
	DiscussshequfuwuVO selectVO(@Param("ew") Wrapper<DiscussshequfuwuEntity> wrapper);
	
	List<DiscussshequfuwuView> selectListView(@Param("ew") Wrapper<DiscussshequfuwuEntity> wrapper);

	List<DiscussshequfuwuView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshequfuwuEntity> wrapper);
	
	DiscussshequfuwuView selectView(@Param("ew") Wrapper<DiscussshequfuwuEntity> wrapper);
	

}
