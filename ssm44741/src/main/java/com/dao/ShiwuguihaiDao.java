package com.dao;

import com.entity.ShiwuguihaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShiwuguihaiVO;
import com.entity.view.ShiwuguihaiView;


/**
 * 拾物归还
 * 
 * @author 
 * @email 
 * @date 2021-04-26 10:15:35
 */
public interface ShiwuguihaiDao extends BaseMapper<ShiwuguihaiEntity> {
	
	List<ShiwuguihaiVO> selectListVO(@Param("ew") Wrapper<ShiwuguihaiEntity> wrapper);
	
	ShiwuguihaiVO selectVO(@Param("ew") Wrapper<ShiwuguihaiEntity> wrapper);
	
	List<ShiwuguihaiView> selectListView(@Param("ew") Wrapper<ShiwuguihaiEntity> wrapper);

	List<ShiwuguihaiView> selectListView(Pagination page,@Param("ew") Wrapper<ShiwuguihaiEntity> wrapper);
	
	ShiwuguihaiView selectView(@Param("ew") Wrapper<ShiwuguihaiEntity> wrapper);
	
}
