package com.dao;

import com.entity.YiqingjianceEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YiqingjianceVO;
import com.entity.view.YiqingjianceView;


/**
 * 疫情监测
 * 
 * @author 
 * @email 
 * @date 2022-04-29 13:15:18
 */
public interface YiqingjianceDao extends BaseMapper<YiqingjianceEntity> {
	
	List<YiqingjianceVO> selectListVO(@Param("ew") Wrapper<YiqingjianceEntity> wrapper);
	
	YiqingjianceVO selectVO(@Param("ew") Wrapper<YiqingjianceEntity> wrapper);
	
	List<YiqingjianceView> selectListView(@Param("ew") Wrapper<YiqingjianceEntity> wrapper);

	List<YiqingjianceView> selectListView(Pagination page,@Param("ew") Wrapper<YiqingjianceEntity> wrapper);
	
	YiqingjianceView selectView(@Param("ew") Wrapper<YiqingjianceEntity> wrapper);
	

}
