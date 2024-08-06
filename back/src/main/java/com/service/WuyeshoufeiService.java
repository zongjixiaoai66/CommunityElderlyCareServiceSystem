package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WuyeshoufeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WuyeshoufeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WuyeshoufeiView;


/**
 * 物业收费
 *
 * @author 
 * @email 
 * @date 2022-04-29 13:15:18
 */
public interface WuyeshoufeiService extends IService<WuyeshoufeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WuyeshoufeiVO> selectListVO(Wrapper<WuyeshoufeiEntity> wrapper);
   	
   	WuyeshoufeiVO selectVO(@Param("ew") Wrapper<WuyeshoufeiEntity> wrapper);
   	
   	List<WuyeshoufeiView> selectListView(Wrapper<WuyeshoufeiEntity> wrapper);
   	
   	WuyeshoufeiView selectView(@Param("ew") Wrapper<WuyeshoufeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WuyeshoufeiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<WuyeshoufeiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<WuyeshoufeiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<WuyeshoufeiEntity> wrapper);
}

