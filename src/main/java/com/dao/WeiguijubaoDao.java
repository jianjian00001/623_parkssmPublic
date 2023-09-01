package com.dao;

import com.entity.WeiguijubaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WeiguijubaoVO;
import com.entity.view.WeiguijubaoView;


/**
 * 违规举报
 * 
 * @author 
 * @email 
 * @date 2021-03-14 08:59:38
 */
public interface WeiguijubaoDao extends BaseMapper<WeiguijubaoEntity> {
	
	List<WeiguijubaoVO> selectListVO(@Param("ew") Wrapper<WeiguijubaoEntity> wrapper);
	
	WeiguijubaoVO selectVO(@Param("ew") Wrapper<WeiguijubaoEntity> wrapper);
	
	List<WeiguijubaoView> selectListView(@Param("ew") Wrapper<WeiguijubaoEntity> wrapper);

	List<WeiguijubaoView> selectListView(Pagination page,@Param("ew") Wrapper<WeiguijubaoEntity> wrapper);
	
	WeiguijubaoView selectView(@Param("ew") Wrapper<WeiguijubaoEntity> wrapper);
	
}
