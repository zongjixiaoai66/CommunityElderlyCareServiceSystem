package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshequhuodongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshequhuodongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshequhuodongView;


/**
 * 社区活动评论表
 *
 * @author 
 * @email 
 * @date 2022-04-29 13:15:18
 */
public interface DiscussshequhuodongService extends IService<DiscussshequhuodongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshequhuodongVO> selectListVO(Wrapper<DiscussshequhuodongEntity> wrapper);
   	
   	DiscussshequhuodongVO selectVO(@Param("ew") Wrapper<DiscussshequhuodongEntity> wrapper);
   	
   	List<DiscussshequhuodongView> selectListView(Wrapper<DiscussshequhuodongEntity> wrapper);
   	
   	DiscussshequhuodongView selectView(@Param("ew") Wrapper<DiscussshequhuodongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshequhuodongEntity> wrapper);
   	

}

