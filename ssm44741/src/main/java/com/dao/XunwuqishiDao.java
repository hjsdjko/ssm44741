package com.dao;

import com.entity.XunwuqishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XunwuqishiVO;
import com.entity.view.XunwuqishiView;


/**
 * 寻物启示
 * 
 * @author 
 * @email 
 * @date 2021-04-26 10:15:35
 */
public interface XunwuqishiDao extends BaseMapper<XunwuqishiEntity> {
	
	List<XunwuqishiVO> selectListVO(@Param("ew") Wrapper<XunwuqishiEntity> wrapper);
	
	XunwuqishiVO selectVO(@Param("ew") Wrapper<XunwuqishiEntity> wrapper);
	
	List<XunwuqishiView> selectListView(@Param("ew") Wrapper<XunwuqishiEntity> wrapper);

	List<XunwuqishiView> selectListView(Pagination page,@Param("ew") Wrapper<XunwuqishiEntity> wrapper);
	
	XunwuqishiView selectView(@Param("ew") Wrapper<XunwuqishiEntity> wrapper);
	
}
