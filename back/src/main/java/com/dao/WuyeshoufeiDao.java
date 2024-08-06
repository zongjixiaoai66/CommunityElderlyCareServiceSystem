package com.dao;

import com.entity.WuyeshoufeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WuyeshoufeiVO;
import com.entity.view.WuyeshoufeiView;


/**
 * 物业收费
 * 
 * @author 
 * @email 
 * @date 2022-04-29 13:15:18
 */
public interface WuyeshoufeiDao extends BaseMapper<WuyeshoufeiEntity> {
	
	List<WuyeshoufeiVO> selectListVO(@Param("ew") Wrapper<WuyeshoufeiEntity> wrapper);
	
	WuyeshoufeiVO selectVO(@Param("ew") Wrapper<WuyeshoufeiEntity> wrapper);
	
	List<WuyeshoufeiView> selectListView(@Param("ew") Wrapper<WuyeshoufeiEntity> wrapper);

	List<WuyeshoufeiView> selectListView(Pagination page,@Param("ew") Wrapper<WuyeshoufeiEntity> wrapper);
	
	WuyeshoufeiView selectView(@Param("ew") Wrapper<WuyeshoufeiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<WuyeshoufeiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<WuyeshoufeiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<WuyeshoufeiEntity> wrapper);
}
