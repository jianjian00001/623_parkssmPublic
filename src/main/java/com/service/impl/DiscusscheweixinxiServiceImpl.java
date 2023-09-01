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


import com.dao.DiscusscheweixinxiDao;
import com.entity.DiscusscheweixinxiEntity;
import com.service.DiscusscheweixinxiService;
import com.entity.vo.DiscusscheweixinxiVO;
import com.entity.view.DiscusscheweixinxiView;

@Service("discusscheweixinxiService")
public class DiscusscheweixinxiServiceImpl extends ServiceImpl<DiscusscheweixinxiDao, DiscusscheweixinxiEntity> implements DiscusscheweixinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusscheweixinxiEntity> page = this.selectPage(
                new Query<DiscusscheweixinxiEntity>(params).getPage(),
                new EntityWrapper<DiscusscheweixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusscheweixinxiEntity> wrapper) {
		  Page<DiscusscheweixinxiView> page =new Query<DiscusscheweixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusscheweixinxiVO> selectListVO(Wrapper<DiscusscheweixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusscheweixinxiVO selectVO(Wrapper<DiscusscheweixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusscheweixinxiView> selectListView(Wrapper<DiscusscheweixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusscheweixinxiView selectView(Wrapper<DiscusscheweixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
