package com.rookie.gmall.sms.dao;

import com.rookie.gmall.sms.entity.SmsMemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author BigRookie
 * @email bigrookie36@gmile.com
 * @date 2020-06-06 17:06:35
 */
@Mapper
public interface SmsMemberPriceDao extends BaseMapper<SmsMemberPriceEntity> {
	
}
