package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShizhuxinyongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShizhuxinyongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShizhuxinyongView;


/**
 * 失主信用
 *
 * @author 
 * @email 
 * @date 2021-04-26 10:15:35
 */
public interface ShizhuxinyongService extends IService<ShizhuxinyongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShizhuxinyongVO> selectListVO(Wrapper<ShizhuxinyongEntity> wrapper);
   	
   	ShizhuxinyongVO selectVO(@Param("ew") Wrapper<ShizhuxinyongEntity> wrapper);
   	
   	List<ShizhuxinyongView> selectListView(Wrapper<ShizhuxinyongEntity> wrapper);
   	
   	ShizhuxinyongView selectView(@Param("ew") Wrapper<ShizhuxinyongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShizhuxinyongEntity> wrapper);
   	
}

