package com.entity.vo;

import com.entity.CheweituizuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 车位退租
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-14 08:59:38
 */
public class CheweituizuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 车位区域
	 */
	
	private String cheweiquyu;
		
	/**
	 * 车位号
	 */
	
	private String cheweihao;
		
	/**
	 * 车位位置
	 */
	
	private String cheweiweizhi;
		
	/**
	 * 停放时价
	 */
	
	private Integer tingfangshijia;
		
	/**
	 * 进场时间
	 */
	
	private String jinchangshijian;
		
	/**
	 * 离开时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date likaishijian;
		
	/**
	 * 停放时长
	 */
	
	private Integer tingfangshizhang;
		
	/**
	 * 租用金额
	 */
	
	private String zuyongjine;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 车牌号
	 */
	
	private String chepaihao;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
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
	 * 设置：进场时间
	 */
	 
	public void setJinchangshijian(String jinchangshijian) {
		this.jinchangshijian = jinchangshijian;
	}
	
	/**
	 * 获取：进场时间
	 */
	public String getJinchangshijian() {
		return jinchangshijian;
	}
				
	
	/**
	 * 设置：离开时间
	 */
	 
	public void setLikaishijian(Date likaishijian) {
		this.likaishijian = likaishijian;
	}
	
	/**
	 * 获取：离开时间
	 */
	public Date getLikaishijian() {
		return likaishijian;
	}
				
	
	/**
	 * 设置：停放时长
	 */
	 
	public void setTingfangshizhang(Integer tingfangshizhang) {
		this.tingfangshizhang = tingfangshizhang;
	}
	
	/**
	 * 获取：停放时长
	 */
	public Integer getTingfangshizhang() {
		return tingfangshizhang;
	}
				
	
	/**
	 * 设置：租用金额
	 */
	 
	public void setZuyongjine(String zuyongjine) {
		this.zuyongjine = zuyongjine;
	}
	
	/**
	 * 获取：租用金额
	 */
	public String getZuyongjine() {
		return zuyongjine;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
	/**
	 * 设置：车牌号
	 */
	 
	public void setChepaihao(String chepaihao) {
		this.chepaihao = chepaihao;
	}
	
	/**
	 * 获取：车牌号
	 */
	public String getChepaihao() {
		return chepaihao;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
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
