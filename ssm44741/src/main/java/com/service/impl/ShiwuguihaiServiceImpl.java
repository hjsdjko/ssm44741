package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShiwuguihaiDao;
import com.entity.ShiwuguihaiEntity;
import com.service.ShiwuguihaiService;
import com.entity.vo.ShiwuguihaiVO;
import com.entity.view.ShiwuguihaiView;

@Service("shiwuguihaiService")
public class ShiwuguihaiServiceImpl extends ServiceImpl<ShiwuguihaiDao, ShiwuguihaiEntity> implements ShiwuguihaiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiwuguihaiEntity> page = this.selectPage(
                new Query<ShiwuguihaiEntity>(params).getPage(),
                new EntityWrapper<ShiwuguihaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShiwuguihaiEntity> wrapper) {
		  Page<ShiwuguihaiView> page =new Query<ShiwuguihaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShiwuguihaiVO> selectListVO(Wrapper<ShiwuguihaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiwuguihaiVO selectVO(Wrapper<ShiwuguihaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiwuguihaiView> selectListView(Wrapper<ShiwuguihaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiwuguihaiView selectView(Wrapper<ShiwuguihaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
