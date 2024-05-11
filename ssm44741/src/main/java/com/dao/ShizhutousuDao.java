package com.dao;

import com.entity.ShizhutousuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShizhutousuVO;
import com.entity.view.ShizhutousuView;


/**
 * 失主投诉
 * 
 * @author 
 * @email 
 * @date 2021-04-26 10:15:35
 */
public interface ShizhutousuDao extends BaseMapper<ShizhutousuEntity> {
	
	List<ShizhutousuVO> selectListVO(@Param("ew") Wrapper<ShizhutousuEntity> wrapper);
	
	ShizhutousuVO selectVO(@Param("ew") Wrapper<ShizhutousuEntity> wrapper);
	
	List<ShizhutousuView> selectListView(@Param("ew") Wrapper<ShizhutousuEntity> wrapper);

	List<ShizhutousuView> selectListView(Pagination page,@Param("ew") Wrapper<ShizhutousuEntity> wrapper);
	
	ShizhutousuView selectView(@Param("ew") Wrapper<ShizhutousuEntity> wrapper);
	
}
