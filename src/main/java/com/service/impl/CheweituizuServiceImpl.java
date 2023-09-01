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


import com.dao.CheweituizuDao;
import com.entity.CheweituizuEntity;
import com.service.CheweituizuService;
import com.entity.vo.CheweituizuVO;
import com.entity.view.CheweituizuView;

@Service("cheweituizuService")
public class CheweituizuServiceImpl extends ServiceImpl<CheweituizuDao, CheweituizuEntity> implements CheweituizuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CheweituizuEntity> page = this.selectPage(
                new Query<CheweituizuEntity>(params).getPage(),
                new EntityWrapper<CheweituizuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CheweituizuEntity> wrapper) {
		  Page<CheweituizuView> page =new Query<CheweituizuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CheweituizuVO> selectListVO(Wrapper<CheweituizuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CheweituizuVO selectVO(Wrapper<CheweituizuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CheweituizuView> selectListView(Wrapper<CheweituizuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CheweituizuView selectView(Wrapper<CheweituizuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
