package com.entity.view;

import com.entity.YiqingjianceEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 疫情监测
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-29 13:15:18
 */
@TableName("yiqingjiance")
public class YiqingjianceView  extends YiqingjianceEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YiqingjianceView(){
	}
 
 	public YiqingjianceView(YiqingjianceEntity yiqingjianceEntity){
 	try {
			BeanUtils.copyProperties(this, yiqingjianceEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
