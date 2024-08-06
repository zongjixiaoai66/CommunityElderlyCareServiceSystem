package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FuwuzhongleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FuwuzhongleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FuwuzhongleiView;


/**
 * 服务种类
 *
 * @author 
 * @email 
 * @date 2022-04-29 13:15:17
 */
public interface FuwuzhongleiService extends IService<FuwuzhongleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FuwuzhongleiVO> selectListVO(Wrapper<FuwuzhongleiEntity> wrapper);
   	
   	FuwuzhongleiVO selectVO(@Param("ew") Wrapper<FuwuzhongleiEntity> wrapper);
   	
   	List<FuwuzhongleiView> selectListView(Wrapper<FuwuzhongleiEntity> wrapper);
   	
   	FuwuzhongleiView selectView(@Param("ew") Wrapper<FuwuzhongleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FuwuzhongleiEntity> wrapper);
   	

}

