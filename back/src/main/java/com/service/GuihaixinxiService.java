package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuihaixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuihaixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuihaixinxiView;


/**
 * 归还信息
 *
 * @author 
 * @email 
 * @date 2022-04-29 13:15:18
 */
public interface GuihaixinxiService extends IService<GuihaixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuihaixinxiVO> selectListVO(Wrapper<GuihaixinxiEntity> wrapper);
   	
   	GuihaixinxiVO selectVO(@Param("ew") Wrapper<GuihaixinxiEntity> wrapper);
   	
   	List<GuihaixinxiView> selectListView(Wrapper<GuihaixinxiEntity> wrapper);
   	
   	GuihaixinxiView selectView(@Param("ew") Wrapper<GuihaixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuihaixinxiEntity> wrapper);
   	

}

