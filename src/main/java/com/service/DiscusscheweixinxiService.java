package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusscheweixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusscheweixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusscheweixinxiView;


/**
 * 车位信息评论表
 *
 * @author 
 * @email 
 * @date 2021-03-14 08:59:38
 */
public interface DiscusscheweixinxiService extends IService<DiscusscheweixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusscheweixinxiVO> selectListVO(Wrapper<DiscusscheweixinxiEntity> wrapper);
   	
   	DiscusscheweixinxiVO selectVO(@Param("ew") Wrapper<DiscusscheweixinxiEntity> wrapper);
   	
   	List<DiscusscheweixinxiView> selectListView(Wrapper<DiscusscheweixinxiEntity> wrapper);
   	
   	DiscusscheweixinxiView selectView(@Param("ew") Wrapper<DiscusscheweixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusscheweixinxiEntity> wrapper);
   	
}

