package com.entity.view;

import com.entity.DiscusszixunzhongxinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 资讯中心评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-29 13:15:18
 */
@TableName("discusszixunzhongxin")
public class DiscusszixunzhongxinView  extends DiscusszixunzhongxinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusszixunzhongxinView(){
	}
 
 	public DiscusszixunzhongxinView(DiscusszixunzhongxinEntity discusszixunzhongxinEntity){
 	try {
			BeanUtils.copyProperties(this, discusszixunzhongxinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
