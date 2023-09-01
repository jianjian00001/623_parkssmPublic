package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CheweizuyongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CheweizuyongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CheweizuyongView;


/**
 * 车位租用
 *
 * @author 
 * @email 
 * @date 2021-03-14 08:59:38
 */
public interface CheweizuyongService extends IService<CheweizuyongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CheweizuyongVO> selectListVO(Wrapper<CheweizuyongEntity> wrapper);
   	
   	CheweizuyongVO selectVO(@Param("ew") Wrapper<CheweizuyongEntity> wrapper);
   	
   	List<CheweizuyongView> selectListView(Wrapper<CheweizuyongEntity> wrapper);
   	
   	CheweizuyongView selectView(@Param("ew") Wrapper<CheweizuyongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CheweizuyongEntity> wrapper);
   	
}

