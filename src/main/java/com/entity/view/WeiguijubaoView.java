package com.entity.view;

import com.entity.WeiguijubaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 违规举报
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-14 08:59:38
 */
@TableName("weiguijubao")
public class WeiguijubaoView  extends WeiguijubaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WeiguijubaoView(){
	}
 
 	public WeiguijubaoView(WeiguijubaoEntity weiguijubaoEntity){
 	try {
			BeanUtils.copyProperties(this, weiguijubaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
