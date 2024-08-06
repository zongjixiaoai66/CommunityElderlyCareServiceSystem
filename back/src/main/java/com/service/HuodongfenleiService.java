package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuodongfenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuodongfenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuodongfenleiView;


/**
 * 活动分类
 *
 * @author 
 * @email 
 * @date 2022-04-29 13:15:18
 */
public interface HuodongfenleiService extends IService<HuodongfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuodongfenleiVO> selectListVO(Wrapper<HuodongfenleiEntity> wrapper);
   	
   	HuodongfenleiVO selectVO(@Param("ew") Wrapper<HuodongfenleiEntity> wrapper);
   	
   	List<HuodongfenleiView> selectListView(Wrapper<HuodongfenleiEntity> wrapper);
   	
   	HuodongfenleiView selectView(@Param("ew") Wrapper<HuodongfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuodongfenleiEntity> wrapper);
   	

}

