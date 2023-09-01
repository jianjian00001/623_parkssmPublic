package com.dao;

import com.entity.CheweituizuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CheweituizuVO;
import com.entity.view.CheweituizuView;


/**
 * 车位退租
 * 
 * @author 
 * @email 
 * @date 2021-03-14 08:59:38
 */
public interface CheweituizuDao extends BaseMapper<CheweituizuEntity> {
	
	List<CheweituizuVO> selectListVO(@Param("ew") Wrapper<CheweituizuEntity> wrapper);
	
	CheweituizuVO selectVO(@Param("ew") Wrapper<CheweituizuEntity> wrapper);
	
	List<CheweituizuView> selectListView(@Param("ew") Wrapper<CheweituizuEntity> wrapper);

	List<CheweituizuView> selectListView(Pagination page,@Param("ew") Wrapper<CheweituizuEntity> wrapper);
	
	CheweituizuView selectView(@Param("ew") Wrapper<CheweituizuEntity> wrapper);
	
}
