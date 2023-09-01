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


import com.dao.WeiguijubaoDao;
import com.entity.WeiguijubaoEntity;
import com.service.WeiguijubaoService;
import com.entity.vo.WeiguijubaoVO;
import com.entity.view.WeiguijubaoView;

@Service("weiguijubaoService")
public class WeiguijubaoServiceImpl extends ServiceImpl<WeiguijubaoDao, WeiguijubaoEntity> implements WeiguijubaoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WeiguijubaoEntity> page = this.selectPage(
                new Query<WeiguijubaoEntity>(params).getPage(),
                new EntityWrapper<WeiguijubaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WeiguijubaoEntity> wrapper) {
		  Page<WeiguijubaoView> page =new Query<WeiguijubaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WeiguijubaoVO> selectListVO(Wrapper<WeiguijubaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WeiguijubaoVO selectVO(Wrapper<WeiguijubaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WeiguijubaoView> selectListView(Wrapper<WeiguijubaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WeiguijubaoView selectView(Wrapper<WeiguijubaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
