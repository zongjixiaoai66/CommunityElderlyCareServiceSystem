package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZixunzhongxinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZixunzhongxinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZixunzhongxinView;


/**
 * 资讯中心
 *
 * @author 
 * @email 
 * @date 2022-04-29 13:15:18
 */
public interface ZixunzhongxinService extends IService<ZixunzhongxinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZixunzhongxinVO> selectListVO(Wrapper<ZixunzhongxinEntity> wrapper);
   	
   	ZixunzhongxinVO selectVO(@Param("ew") Wrapper<ZixunzhongxinEntity> wrapper);
   	
   	List<ZixunzhongxinView> selectListView(Wrapper<ZixunzhongxinEntity> wrapper);
   	
   	ZixunzhongxinView selectView(@Param("ew") Wrapper<ZixunzhongxinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZixunzhongxinEntity> wrapper);
   	

}

