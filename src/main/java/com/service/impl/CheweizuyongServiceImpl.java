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


import com.dao.CheweizuyongDao;
import com.entity.CheweizuyongEntity;
import com.service.CheweizuyongService;
import com.entity.vo.CheweizuyongVO;
import com.entity.view.CheweizuyongView;

@Service("cheweizuyongService")
public class CheweizuyongServiceImpl extends ServiceImpl<CheweizuyongDao, CheweizuyongEntity> implements CheweizuyongService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CheweizuyongEntity> page = this.selectPage(
                new Query<CheweizuyongEntity>(params).getPage(),
                new EntityWrapper<CheweizuyongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CheweizuyongEntity> wrapper) {
		  Page<CheweizuyongView> page =new Query<CheweizuyongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CheweizuyongVO> selectListVO(Wrapper<CheweizuyongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CheweizuyongVO selectVO(Wrapper<CheweizuyongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CheweizuyongView> selectListView(Wrapper<CheweizuyongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CheweizuyongView selectView(Wrapper<CheweizuyongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
