package com.entity.view;

import com.entity.WupinzhongleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 物品种类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-29 13:15:17
 */
@TableName("wupinzhonglei")
public class WupinzhongleiView  extends WupinzhongleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WupinzhongleiView(){
	}
 
 	public WupinzhongleiView(WupinzhongleiEntity wupinzhongleiEntity){
 	try {
			BeanUtils.copyProperties(this, wupinzhongleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
