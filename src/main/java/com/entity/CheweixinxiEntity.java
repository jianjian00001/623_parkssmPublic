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
 * 车位信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-14 08:59:38
 */
@TableName("cheweixinxi")
public class CheweixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public CheweixinxiEntity() {
		
	}
	
	public CheweixinxiEntity(T t) {
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
	 * 车位区域
	 */
					
	private String cheweiquyu;
	
	/**
	 * 车位号
	 */
					
	private String cheweihao;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 车位位置
	 */
					
	private String cheweiweizhi;
	
	/**
	 * 车位状态
	 */
					
	private String cheweizhuangtai;
	
	/**
	 * 停放时价
	 */
					
	private Integer tingfangshijia;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	
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
	 * 设置：车位区域
	 */
	public void setCheweiquyu(String cheweiquyu) {
		this.cheweiquyu = cheweiquyu;
	}
	/**
	 * 获取：车位区域
	 */
	public String getCheweiquyu() {
		return cheweiquyu;
	}
	/**
	 * 设置：车位号
	 */
	public void setCheweihao(String cheweihao) {
		this.cheweihao = cheweihao;
	}
	/**
	 * 获取：车位号
	 */
	public String getCheweihao() {
		return cheweihao;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：车位位置
	 */
	public void setCheweiweizhi(String cheweiweizhi) {
		this.cheweiweizhi = cheweiweizhi;
	}
	/**
	 * 获取：车位位置
	 */
	public String getCheweiweizhi() {
		return cheweiweizhi;
	}
	/**
	 * 设置：车位状态
	 */
	public void setCheweizhuangtai(String cheweizhuangtai) {
		this.cheweizhuangtai = cheweizhuangtai;
	}
	/**
	 * 获取：车位状态
	 */
	public String getCheweizhuangtai() {
		return cheweizhuangtai;
	}
	/**
	 * 设置：停放时价
	 */
	public void setTingfangshijia(Integer tingfangshijia) {
		this.tingfangshijia = tingfangshijia;
	}
	/**
	 * 获取：停放时价
	 */
	public Integer getTingfangshijia() {
		return tingfangshijia;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}

}
