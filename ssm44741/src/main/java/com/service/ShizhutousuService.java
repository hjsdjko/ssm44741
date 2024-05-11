package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShizhutousuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShizhutousuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShizhutousuView;


/**
 * 失主投诉
 *
 * @author 
 * @email 
 * @date 2021-04-26 10:15:35
 */
public interface ShizhutousuService extends IService<ShizhutousuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShizhutousuVO> selectListVO(Wrapper<ShizhutousuEntity> wrapper);
   	
   	ShizhutousuVO selectVO(@Param("ew") Wrapper<ShizhutousuEntity> wrapper);
   	
   	List<ShizhutousuView> selectListView(Wrapper<ShizhutousuEntity> wrapper);
   	
   	ShizhutousuView selectView(@Param("ew") Wrapper<ShizhutousuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShizhutousuEntity> wrapper);
   	
}

