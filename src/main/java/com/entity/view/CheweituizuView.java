package com.entity.view;

import com.entity.CheweituizuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 车位退租
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-14 08:59:38
 */
@TableName("cheweituizu")
public class CheweituizuView  extends CheweituizuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CheweituizuView(){
	}
 
 	public CheweituizuView(CheweituizuEntity cheweituizuEntity){
 	try {
			BeanUtils.copyProperties(this, cheweituizuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
