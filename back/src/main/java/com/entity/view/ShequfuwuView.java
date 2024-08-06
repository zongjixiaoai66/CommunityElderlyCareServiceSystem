package com.entity.view;

import com.entity.ShequfuwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 社区服务
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-29 13:15:17
 */
@TableName("shequfuwu")
public class ShequfuwuView  extends ShequfuwuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShequfuwuView(){
	}
 
 	public ShequfuwuView(ShequfuwuEntity shequfuwuEntity){
 	try {
			BeanUtils.copyProperties(this, shequfuwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
