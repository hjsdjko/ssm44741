package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiwuguihaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShiwuguihaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiwuguihaiView;


/**
 * 拾物归还
 *
 * @author 
 * @email 
 * @date 2021-04-26 10:15:35
 */
public interface ShiwuguihaiService extends IService<ShiwuguihaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiwuguihaiVO> selectListVO(Wrapper<ShiwuguihaiEntity> wrapper);
   	
   	ShiwuguihaiVO selectVO(@Param("ew") Wrapper<ShiwuguihaiEntity> wrapper);
   	
   	List<ShiwuguihaiView> selectListView(Wrapper<ShiwuguihaiEntity> wrapper);
   	
   	ShiwuguihaiView selectView(@Param("ew") Wrapper<ShiwuguihaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiwuguihaiEntity> wrapper);
   	
}

