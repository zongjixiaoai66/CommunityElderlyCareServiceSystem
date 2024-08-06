package com.entity.model;

import com.entity.WuyeshoufeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 物业收费
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-29 13:15:18
 */
public class WuyeshoufeiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
		
	/**
	 * 物业费
	 */
	
	private Float wuyefei;
		
	/**
	 * 绿化养护
	 */
	
	private Float lvhuayanghu;
		
	/**
	 * 清洁卫生
	 */
	
	private Float qingjieweisheng;
		
	/**
	 * 其它收费
	 */
	
	private Float qitashoufei;
		
	/**
	 * 收费说明
	 */
	
	private String shoufeishuoming;
		
	/**
	 * 总金额
	 */
	
	private Float zongjine;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：联系方式
	 */
	 
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
				
	
	/**
	 * 设置：物业费
	 */
	 
	public void setWuyefei(Float wuyefei) {
		this.wuyefei = wuyefei;
	}
	
	/**
	 * 获取：物业费
	 */
	public Float getWuyefei() {
		return wuyefei;
	}
				
	
	/**
	 * 设置：绿化养护
	 */
	 
	public void setLvhuayanghu(Float lvhuayanghu) {
		this.lvhuayanghu = lvhuayanghu;
	}
	
	/**
	 * 获取：绿化养护
	 */
	public Float getLvhuayanghu() {
		return lvhuayanghu;
	}
				
	
	/**
	 * 设置：清洁卫生
	 */
	 
	public void setQingjieweisheng(Float qingjieweisheng) {
		this.qingjieweisheng = qingjieweisheng;
	}
	
	/**
	 * 获取：清洁卫生
	 */
	public Float getQingjieweisheng() {
		return qingjieweisheng;
	}
				
	
	/**
	 * 设置：其它收费
	 */
	 
	public void setQitashoufei(Float qitashoufei) {
		this.qitashoufei = qitashoufei;
	}
	
	/**
	 * 获取：其它收费
	 */
	public Float getQitashoufei() {
		return qitashoufei;
	}
				
	
	/**
	 * 设置：收费说明
	 */
	 
	public void setShoufeishuoming(String shoufeishuoming) {
		this.shoufeishuoming = shoufeishuoming;
	}
	
	/**
	 * 获取：收费说明
	 */
	public String getShoufeishuoming() {
		return shoufeishuoming;
	}
				
	
	/**
	 * 设置：总金额
	 */
	 
	public void setZongjine(Float zongjine) {
		this.zongjine = zongjine;
	}
	
	/**
	 * 获取：总金额
	 */
	public Float getZongjine() {
		return zongjine;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
