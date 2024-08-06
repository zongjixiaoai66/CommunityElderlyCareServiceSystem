package com.dao;

import com.entity.WupinzhongleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WupinzhongleiVO;
import com.entity.view.WupinzhongleiView;


/**
 * 物品种类
 * 
 * @author 
 * @email 
 * @date 2022-04-29 13:15:17
 */
public interface WupinzhongleiDao extends BaseMapper<WupinzhongleiEntity> {
	
	List<WupinzhongleiVO> selectListVO(@Param("ew") Wrapper<WupinzhongleiEntity> wrapper);
	
	WupinzhongleiVO selectVO(@Param("ew") Wrapper<WupinzhongleiEntity> wrapper);
	
	List<WupinzhongleiView> selectListView(@Param("ew") Wrapper<WupinzhongleiEntity> wrapper);

	List<WupinzhongleiView> selectListView(Pagination page,@Param("ew") Wrapper<WupinzhongleiEntity> wrapper);
	
	WupinzhongleiView selectView(@Param("ew") Wrapper<WupinzhongleiEntity> wrapper);
	

}
