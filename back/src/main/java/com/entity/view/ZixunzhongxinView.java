package com.entity.view;

import com.entity.ZixunzhongxinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 资讯中心
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-29 13:15:18
 */
@TableName("zixunzhongxin")
public class ZixunzhongxinView  extends ZixunzhongxinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZixunzhongxinView(){
	}
 
 	public ZixunzhongxinView(ZixunzhongxinEntity zixunzhongxinEntity){
 	try {
			BeanUtils.copyProperties(this, zixunzhongxinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
