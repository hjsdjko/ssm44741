package com.entity.view;

import com.entity.ShizhuxinyongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 失主信用
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-26 10:15:35
 */
@TableName("shizhuxinyong")
public class ShizhuxinyongView  extends ShizhuxinyongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShizhuxinyongView(){
	}
 
 	public ShizhuxinyongView(ShizhuxinyongEntity shizhuxinyongEntity){
 	try {
			BeanUtils.copyProperties(this, shizhuxinyongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
