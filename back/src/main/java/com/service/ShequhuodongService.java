package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShequhuodongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShequhuodongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShequhuodongView;


/**
 * 社区活动
 *
 * @author 
 * @email 
 * @date 2022-04-29 13:15:18
 */
public interface ShequhuodongService extends IService<ShequhuodongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShequhuodongVO> selectListVO(Wrapper<ShequhuodongEntity> wrapper);
   	
   	ShequhuodongVO selectVO(@Param("ew") Wrapper<ShequhuodongEntity> wrapper);
   	
   	List<ShequhuodongView> selectListView(Wrapper<ShequhuodongEntity> wrapper);
   	
   	ShequhuodongView selectView(@Param("ew") Wrapper<ShequhuodongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShequhuodongEntity> wrapper);
   	

}

