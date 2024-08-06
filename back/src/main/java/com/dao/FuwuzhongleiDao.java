package com.dao;

import com.entity.FuwuzhongleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FuwuzhongleiVO;
import com.entity.view.FuwuzhongleiView;


/**
 * 服务种类
 * 
 * @author 
 * @email 
 * @date 2022-04-29 13:15:17
 */
public interface FuwuzhongleiDao extends BaseMapper<FuwuzhongleiEntity> {
	
	List<FuwuzhongleiVO> selectListVO(@Param("ew") Wrapper<FuwuzhongleiEntity> wrapper);
	
	FuwuzhongleiVO selectVO(@Param("ew") Wrapper<FuwuzhongleiEntity> wrapper);
	
	List<FuwuzhongleiView> selectListView(@Param("ew") Wrapper<FuwuzhongleiEntity> wrapper);

	List<FuwuzhongleiView> selectListView(Pagination page,@Param("ew") Wrapper<FuwuzhongleiEntity> wrapper);
	
	FuwuzhongleiView selectView(@Param("ew") Wrapper<FuwuzhongleiEntity> wrapper);
	

}
