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


import com.dao.ShizhuxinyongDao;
import com.entity.ShizhuxinyongEntity;
import com.service.ShizhuxinyongService;
import com.entity.vo.ShizhuxinyongVO;
import com.entity.view.ShizhuxinyongView;

@Service("shizhuxinyongService")
public class ShizhuxinyongServiceImpl extends ServiceImpl<ShizhuxinyongDao, ShizhuxinyongEntity> implements ShizhuxinyongService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShizhuxinyongEntity> page = this.selectPage(
                new Query<ShizhuxinyongEntity>(params).getPage(),
                new EntityWrapper<ShizhuxinyongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShizhuxinyongEntity> wrapper) {
		  Page<ShizhuxinyongView> page =new Query<ShizhuxinyongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShizhuxinyongVO> selectListVO(Wrapper<ShizhuxinyongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShizhuxinyongVO selectVO(Wrapper<ShizhuxinyongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShizhuxinyongView> selectListView(Wrapper<ShizhuxinyongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShizhuxinyongView selectView(Wrapper<ShizhuxinyongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
