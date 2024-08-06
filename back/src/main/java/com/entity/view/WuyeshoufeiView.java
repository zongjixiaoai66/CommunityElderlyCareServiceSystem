package com.entity.view;

import com.entity.WuyeshoufeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 物业收费
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-29 13:15:18
 */
@TableName("wuyeshoufei")
public class WuyeshoufeiView  extends WuyeshoufeiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WuyeshoufeiView(){
	}
 
 	public WuyeshoufeiView(WuyeshoufeiEntity wuyeshoufeiEntity){
 	try {
			BeanUtils.copyProperties(this, wuyeshoufeiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
