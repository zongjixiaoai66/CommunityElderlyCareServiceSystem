package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YiqingjianceEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YiqingjianceVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YiqingjianceView;


/**
 * 疫情监测
 *
 * @author 
 * @email 
 * @date 2022-04-29 13:15:18
 */
public interface YiqingjianceService extends IService<YiqingjianceEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YiqingjianceVO> selectListVO(Wrapper<YiqingjianceEntity> wrapper);
   	
   	YiqingjianceVO selectVO(@Param("ew") Wrapper<YiqingjianceEntity> wrapper);
   	
   	List<YiqingjianceView> selectListView(Wrapper<YiqingjianceEntity> wrapper);
   	
   	YiqingjianceView selectView(@Param("ew") Wrapper<YiqingjianceEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YiqingjianceEntity> wrapper);
   	

}

