package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WeiguijubaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WeiguijubaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WeiguijubaoView;


/**
 * 违规举报
 *
 * @author 
 * @email 
 * @date 2021-03-14 08:59:38
 */
public interface WeiguijubaoService extends IService<WeiguijubaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WeiguijubaoVO> selectListVO(Wrapper<WeiguijubaoEntity> wrapper);
   	
   	WeiguijubaoVO selectVO(@Param("ew") Wrapper<WeiguijubaoEntity> wrapper);
   	
   	List<WeiguijubaoView> selectListView(Wrapper<WeiguijubaoEntity> wrapper);
   	
   	WeiguijubaoView selectView(@Param("ew") Wrapper<WeiguijubaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WeiguijubaoEntity> wrapper);
   	
}

