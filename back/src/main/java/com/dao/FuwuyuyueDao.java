package com.dao;

import com.entity.FuwuyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FuwuyuyueVO;
import com.entity.view.FuwuyuyueView;


/**
 * 服务预约
 * 
 * @author 
 * @email 
 * @date 2022-04-29 13:15:17
 */
public interface FuwuyuyueDao extends BaseMapper<FuwuyuyueEntity> {
	
	List<FuwuyuyueVO> selectListVO(@Param("ew") Wrapper<FuwuyuyueEntity> wrapper);
	
	FuwuyuyueVO selectVO(@Param("ew") Wrapper<FuwuyuyueEntity> wrapper);
	
	List<FuwuyuyueView> selectListView(@Param("ew") Wrapper<FuwuyuyueEntity> wrapper);

	List<FuwuyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<FuwuyuyueEntity> wrapper);
	
	FuwuyuyueView selectView(@Param("ew") Wrapper<FuwuyuyueEntity> wrapper);
	

}
