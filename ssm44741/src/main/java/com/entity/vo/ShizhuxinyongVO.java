package com.entity.vo;

import com.entity.ShizhuxinyongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 失主信用
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-26 10:15:35
 */
public class ShizhuxinyongVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 失主姓名
	 */
	
	private String shizhuxingming;
		
	/**
	 * 信用积分
	 */
	
	private Integer xinyongjifen;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：失主姓名
	 */
	 
	public void setShizhuxingming(String shizhuxingming) {
		this.shizhuxingming = shizhuxingming;
	}
	
	/**
	 * 获取：失主姓名
	 */
	public String getShizhuxingming() {
		return shizhuxingming;
	}
				
	
	/**
	 * 设置：信用积分
	 */
	 
	public void setXinyongjifen(Integer xinyongjifen) {
		this.xinyongjifen = xinyongjifen;
	}
	
	/**
	 * 获取：信用积分
	 */
	public Integer getXinyongjifen() {
		return xinyongjifen;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
