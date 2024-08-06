package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszixunzhongxinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszixunzhongxinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszixunzhongxinView;


/**
 * 资讯中心评论表
 *
 * @author 
 * @email 
 * @date 2022-04-29 13:15:18
 */
public interface DiscusszixunzhongxinService extends IService<DiscusszixunzhongxinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszixunzhongxinVO> selectListVO(Wrapper<DiscusszixunzhongxinEntity> wrapper);
   	
   	DiscusszixunzhongxinVO selectVO(@Param("ew") Wrapper<DiscusszixunzhongxinEntity> wrapper);
   	
   	List<DiscusszixunzhongxinView> selectListView(Wrapper<DiscusszixunzhongxinEntity> wrapper);
   	
   	DiscusszixunzhongxinView selectView(@Param("ew") Wrapper<DiscusszixunzhongxinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszixunzhongxinEntity> wrapper);
   	

}

