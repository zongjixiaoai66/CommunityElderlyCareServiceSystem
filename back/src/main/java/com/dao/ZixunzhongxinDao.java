package com.dao;

import com.entity.ZixunzhongxinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZixunzhongxinVO;
import com.entity.view.ZixunzhongxinView;


/**
 * 资讯中心
 * 
 * @author 
 * @email 
 * @date 2022-04-29 13:15:18
 */
public interface ZixunzhongxinDao extends BaseMapper<ZixunzhongxinEntity> {
	
	List<ZixunzhongxinVO> selectListVO(@Param("ew") Wrapper<ZixunzhongxinEntity> wrapper);
	
	ZixunzhongxinVO selectVO(@Param("ew") Wrapper<ZixunzhongxinEntity> wrapper);
	
	List<ZixunzhongxinView> selectListView(@Param("ew") Wrapper<ZixunzhongxinEntity> wrapper);

	List<ZixunzhongxinView> selectListView(Pagination page,@Param("ew") Wrapper<ZixunzhongxinEntity> wrapper);
	
	ZixunzhongxinView selectView(@Param("ew") Wrapper<ZixunzhongxinEntity> wrapper);
	

}
