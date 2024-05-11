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


import com.dao.ShizhutousuDao;
import com.entity.ShizhutousuEntity;
import com.service.ShizhutousuService;
import com.entity.vo.ShizhutousuVO;
import com.entity.view.ShizhutousuView;

@Service("shizhutousuService")
public class ShizhutousuServiceImpl extends ServiceImpl<ShizhutousuDao, ShizhutousuEntity> implements ShizhutousuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShizhutousuEntity> page = this.selectPage(
                new Query<ShizhutousuEntity>(params).getPage(),
                new EntityWrapper<ShizhutousuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShizhutousuEntity> wrapper) {
		  Page<ShizhutousuView> page =new Query<ShizhutousuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShizhutousuVO> selectListVO(Wrapper<ShizhutousuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShizhutousuVO selectVO(Wrapper<ShizhutousuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShizhutousuView> selectListView(Wrapper<ShizhutousuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShizhutousuView selectView(Wrapper<ShizhutousuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
