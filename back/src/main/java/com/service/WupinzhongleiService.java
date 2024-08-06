package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WupinzhongleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WupinzhongleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WupinzhongleiView;


/**
 * 物品种类
 *
 * @author 
 * @email 
 * @date 2022-04-29 13:15:17
 */
public interface WupinzhongleiService extends IService<WupinzhongleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WupinzhongleiVO> selectListVO(Wrapper<WupinzhongleiEntity> wrapper);
   	
   	WupinzhongleiVO selectVO(@Param("ew") Wrapper<WupinzhongleiEntity> wrapper);
   	
   	List<WupinzhongleiView> selectListView(Wrapper<WupinzhongleiEntity> wrapper);
   	
   	WupinzhongleiView selectView(@Param("ew") Wrapper<WupinzhongleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WupinzhongleiEntity> wrapper);
   	

}

