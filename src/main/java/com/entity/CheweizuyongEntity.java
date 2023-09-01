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
 * 车位租用
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-14 08:59:38
 */
@TableName("cheweizuyong")
public class CheweizuyongEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public CheweizuyongEntity() {
		
	}
	
	public CheweizuyongEntity(T t) {
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
	 * 租用编号
	 */
					
	private String zuyongbianhao;
	
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
	 * 车位状态
	 */
					
	private String cheweizhuangtai;
	
	/**
	 * 停放时价
	 */
					
	private String tingfangshijia;
	
	/**
	 * 进场时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date jinchangshijian;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
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
	 * 设置：租用编号
	 */
	public void setZuyongbianhao(String zuyongbianhao) {
		this.zuyongbianhao = zuyongbianhao;
	}
	/**
	 * 获取：租用编号
	 */
	public String getZuyongbianhao() {
		return zuyongbianhao;
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
	public void setTingfangshijia(String tingfangshijia) {
		this.tingfangshijia = tingfangshijia;
	}
	/**
	 * 获取：停放时价
	 */
	public String getTingfangshijia() {
		return tingfangshijia;
	}
	/**
	 * 设置：进场时间
	 */
	public void setJinchangshijian(Date jinchangshijian) {
		this.jinchangshijian = jinchangshijian;
	}
	/**
	 * 获取：进场时间
	 */
	public Date getJinchangshijian() {
		return jinchangshijian;
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
	 * 设置：手机
	 */
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
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

}
