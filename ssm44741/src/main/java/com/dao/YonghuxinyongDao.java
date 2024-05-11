package com.dao;

import com.entity.YonghuxinyongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YonghuxinyongVO;
import com.entity.view.YonghuxinyongView;


/**
 * 用户信用
 * 
 * @author 
 * @email 
 * @date 2021-04-26 10:15:35
 */
public interface YonghuxinyongDao extends BaseMapper<YonghuxinyongEntity> {
	
	List<YonghuxinyongVO> selectListVO(@Param("ew") Wrapper<YonghuxinyongEntity> wrapper);
	
	YonghuxinyongVO selectVO(@Param("ew") Wrapper<YonghuxinyongEntity> wrapper);
	
	List<YonghuxinyongView> selectListView(@Param("ew") Wrapper<YonghuxinyongEntity> wrapper);

	List<YonghuxinyongView> selectListView(Pagination page,@Param("ew") Wrapper<YonghuxinyongEntity> wrapper);
	
	YonghuxinyongView selectView(@Param("ew") Wrapper<YonghuxinyongEntity> wrapper);
	
}
