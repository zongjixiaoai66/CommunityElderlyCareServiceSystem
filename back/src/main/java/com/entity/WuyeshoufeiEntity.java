package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 物业收费
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-29 13:15:18
 */
@TableName("wuyeshoufei")
public class WuyeshoufeiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WuyeshoufeiEntity() {
		
	}
	
	public WuyeshoufeiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 收费月份
	 */
					
	private String shoufeiyuefen;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：收费月份
	 */
	public void setShoufeiyuefen(String shoufeiyuefen) {
		this.shoufeiyuefen = shoufeiyuefen;
	}
	/**
	 * 获取：收费月份
	 */
	public String getShoufeiyuefen() {
		return shoufeiyuefen;
	}
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
