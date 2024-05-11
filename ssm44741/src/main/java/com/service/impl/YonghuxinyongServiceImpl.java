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


import com.dao.YonghuxinyongDao;
import com.entity.YonghuxinyongEntity;
import com.service.YonghuxinyongService;
import com.entity.vo.YonghuxinyongVO;
import com.entity.view.YonghuxinyongView;

@Service("yonghuxinyongService")
public class YonghuxinyongServiceImpl extends ServiceImpl<YonghuxinyongDao, YonghuxinyongEntity> implements YonghuxinyongService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YonghuxinyongEntity> page = this.selectPage(
                new Query<YonghuxinyongEntity>(params).getPage(),
                new EntityWrapper<YonghuxinyongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YonghuxinyongEntity> wrapper) {
		  Page<YonghuxinyongView> page =new Query<YonghuxinyongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YonghuxinyongVO> selectListVO(Wrapper<YonghuxinyongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YonghuxinyongVO selectVO(Wrapper<YonghuxinyongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YonghuxinyongView> selectListView(Wrapper<YonghuxinyongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YonghuxinyongView selectView(Wrapper<YonghuxinyongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
