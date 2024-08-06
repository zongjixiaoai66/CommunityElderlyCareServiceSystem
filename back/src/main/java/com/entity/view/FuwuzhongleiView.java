package com.entity.view;

import com.entity.FuwuzhongleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 服务种类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-29 13:15:17
 */
@TableName("fuwuzhonglei")
public class FuwuzhongleiView  extends FuwuzhongleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FuwuzhongleiView(){
	}
 
 	public FuwuzhongleiView(FuwuzhongleiEntity fuwuzhongleiEntity){
 	try {
			BeanUtils.copyProperties(this, fuwuzhongleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
