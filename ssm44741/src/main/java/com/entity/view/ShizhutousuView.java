package com.entity.view;

import com.entity.ShizhutousuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 失主投诉
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-26 10:15:35
 */
@TableName("shizhutousu")
public class ShizhutousuView  extends ShizhutousuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShizhutousuView(){
	}
 
 	public ShizhutousuView(ShizhutousuEntity shizhutousuEntity){
 	try {
			BeanUtils.copyProperties(this, shizhutousuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
