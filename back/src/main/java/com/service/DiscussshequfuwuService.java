package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshequfuwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshequfuwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshequfuwuView;


/**
 * 社区服务评论表
 *
 * @author 
 * @email 
 * @date 2022-04-29 13:15:18
 */
public interface DiscussshequfuwuService extends IService<DiscussshequfuwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshequfuwuVO> selectListVO(Wrapper<DiscussshequfuwuEntity> wrapper);
   	
   	DiscussshequfuwuVO selectVO(@Param("ew") Wrapper<DiscussshequfuwuEntity> wrapper);
   	
   	List<DiscussshequfuwuView> selectListView(Wrapper<DiscussshequfuwuEntity> wrapper);
   	
   	DiscussshequfuwuView selectView(@Param("ew") Wrapper<DiscussshequfuwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshequfuwuEntity> wrapper);
   	

}

