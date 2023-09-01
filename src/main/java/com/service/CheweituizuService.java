package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CheweituizuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CheweituizuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CheweituizuView;


/**
 * 车位退租
 *
 * @author 
 * @email 
 * @date 2021-03-14 08:59:38
 */
public interface CheweituizuService extends IService<CheweituizuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CheweituizuVO> selectListVO(Wrapper<CheweituizuEntity> wrapper);
   	
   	CheweituizuVO selectVO(@Param("ew") Wrapper<CheweituizuEntity> wrapper);
   	
   	List<CheweituizuView> selectListView(Wrapper<CheweituizuEntity> wrapper);
   	
   	CheweituizuView selectView(@Param("ew") Wrapper<CheweituizuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CheweituizuEntity> wrapper);
   	
}

