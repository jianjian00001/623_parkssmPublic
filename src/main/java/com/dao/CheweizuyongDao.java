package com.dao;

import com.entity.CheweizuyongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CheweizuyongVO;
import com.entity.view.CheweizuyongView;


/**
 * 车位租用
 * 
 * @author 
 * @email 
 * @date 2021-03-14 08:59:38
 */
public interface CheweizuyongDao extends BaseMapper<CheweizuyongEntity> {
	
	List<CheweizuyongVO> selectListVO(@Param("ew") Wrapper<CheweizuyongEntity> wrapper);
	
	CheweizuyongVO selectVO(@Param("ew") Wrapper<CheweizuyongEntity> wrapper);
	
	List<CheweizuyongView> selectListView(@Param("ew") Wrapper<CheweizuyongEntity> wrapper);

	List<CheweizuyongView> selectListView(Pagination page,@Param("ew") Wrapper<CheweizuyongEntity> wrapper);
	
	CheweizuyongView selectView(@Param("ew") Wrapper<CheweizuyongEntity> wrapper);
	
}
