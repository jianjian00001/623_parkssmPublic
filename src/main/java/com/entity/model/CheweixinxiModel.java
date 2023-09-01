package com.entity.model;

import com.entity.CheweixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 车位信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-14 08:59:38
 */
public class CheweixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
