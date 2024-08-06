package com.entity.model;

import com.entity.YonghuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 用户
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-29 13:15:17
 */
public class YonghuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 家庭住址
	 */
	
	private String jiatingzhuzhi;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
		
	/**
	 * 亲属姓名
	 */
	
	private String qinshuxingming;
		
	/**
	 * 亲属关系
	 */
	
	private String qinshuguanxi;
		
	/**
	 * 紧急电话
	 */
	
	private String jinjidianhua;
		
	/**
	 * 疾病史
	 */
	
	private String jibingshi;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：密码
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
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
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：家庭住址
	 */
	 
	public void setJiatingzhuzhi(String jiatingzhuzhi) {
		this.jiatingzhuzhi = jiatingzhuzhi;
	}
	
	/**
	 * 获取：家庭住址
	 */
	public String getJiatingzhuzhi() {
		return jiatingzhuzhi;
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
	 * 设置：亲属姓名
	 */
	 
	public void setQinshuxingming(String qinshuxingming) {
		this.qinshuxingming = qinshuxingming;
	}
	
	/**
	 * 获取：亲属姓名
	 */
	public String getQinshuxingming() {
		return qinshuxingming;
	}
				
	
	/**
	 * 设置：亲属关系
	 */
	 
	public void setQinshuguanxi(String qinshuguanxi) {
		this.qinshuguanxi = qinshuguanxi;
	}
	
	/**
	 * 获取：亲属关系
	 */
	public String getQinshuguanxi() {
		return qinshuguanxi;
	}
				
	
	/**
	 * 设置：紧急电话
	 */
	 
	public void setJinjidianhua(String jinjidianhua) {
		this.jinjidianhua = jinjidianhua;
	}
	
	/**
	 * 获取：紧急电话
	 */
	public String getJinjidianhua() {
		return jinjidianhua;
	}
				
	
	/**
	 * 设置：疾病史
	 */
	 
	public void setJibingshi(String jibingshi) {
		this.jibingshi = jibingshi;
	}
	
	/**
	 * 获取：疾病史
	 */
	public String getJibingshi() {
		return jibingshi;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}
