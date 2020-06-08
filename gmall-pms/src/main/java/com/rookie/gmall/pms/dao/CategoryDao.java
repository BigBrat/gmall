package com.rookie.gmall.pms.dao;

import com.rookie.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author BigRookie
 * @email bigrookie36@gmile.com
 * @date 2020-06-06 15:35:36
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
