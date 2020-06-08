package com.rookie.gmall.pms.dao;

import com.rookie.gmall.pms.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author BigRookie
 * @email bigrookie36@gmile.com
 * @date 2020-06-06 15:35:36
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
