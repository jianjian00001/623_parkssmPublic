package com.entity.view;

import com.entity.CheweizuyongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 车位租用
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-14 08:59:38
 */
@TableName("cheweizuyong")
public class CheweizuyongView  extends CheweizuyongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CheweizuyongView(){
	}
 
 	public CheweizuyongView(CheweizuyongEntity cheweizuyongEntity){
 	try {
			BeanUtils.copyProperties(this, cheweizuyongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
