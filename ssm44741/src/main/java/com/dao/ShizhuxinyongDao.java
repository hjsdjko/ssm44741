package com.dao;

import com.entity.ShizhuxinyongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShizhuxinyongVO;
import com.entity.view.ShizhuxinyongView;


/**
 * 失主信用
 * 
 * @author 
 * @email 
 * @date 2021-04-26 10:15:35
 */
public interface ShizhuxinyongDao extends BaseMapper<ShizhuxinyongEntity> {
	
	List<ShizhuxinyongVO> selectListVO(@Param("ew") Wrapper<ShizhuxinyongEntity> wrapper);
	
	ShizhuxinyongVO selectVO(@Param("ew") Wrapper<ShizhuxinyongEntity> wrapper);
	
	List<ShizhuxinyongView> selectListView(@Param("ew") Wrapper<ShizhuxinyongEntity> wrapper);

	List<ShizhuxinyongView> selectListView(Pagination page,@Param("ew") Wrapper<ShizhuxinyongEntity> wrapper);
	
	ShizhuxinyongView selectView(@Param("ew") Wrapper<ShizhuxinyongEntity> wrapper);
	
}
