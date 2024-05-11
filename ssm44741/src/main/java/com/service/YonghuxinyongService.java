package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YonghuxinyongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YonghuxinyongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YonghuxinyongView;


/**
 * 用户信用
 *
 * @author 
 * @email 
 * @date 2021-04-26 10:15:35
 */
public interface YonghuxinyongService extends IService<YonghuxinyongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YonghuxinyongVO> selectListVO(Wrapper<YonghuxinyongEntity> wrapper);
   	
   	YonghuxinyongVO selectVO(@Param("ew") Wrapper<YonghuxinyongEntity> wrapper);
   	
   	List<YonghuxinyongView> selectListView(Wrapper<YonghuxinyongEntity> wrapper);
   	
   	YonghuxinyongView selectView(@Param("ew") Wrapper<YonghuxinyongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YonghuxinyongEntity> wrapper);
   	
}

