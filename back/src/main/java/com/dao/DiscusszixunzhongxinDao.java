package com.dao;

import com.entity.DiscusszixunzhongxinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusszixunzhongxinVO;
import com.entity.view.DiscusszixunzhongxinView;


/**
 * 资讯中心评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-29 13:15:18
 */
public interface DiscusszixunzhongxinDao extends BaseMapper<DiscusszixunzhongxinEntity> {
	
	List<DiscusszixunzhongxinVO> selectListVO(@Param("ew") Wrapper<DiscusszixunzhongxinEntity> wrapper);
	
	DiscusszixunzhongxinVO selectVO(@Param("ew") Wrapper<DiscusszixunzhongxinEntity> wrapper);
	
	List<DiscusszixunzhongxinView> selectListView(@Param("ew") Wrapper<DiscusszixunzhongxinEntity> wrapper);

	List<DiscusszixunzhongxinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszixunzhongxinEntity> wrapper);
	
	DiscusszixunzhongxinView selectView(@Param("ew") Wrapper<DiscusszixunzhongxinEntity> wrapper);
	

}
