package com.rookie.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rookie.gmall.sms.entity.SmsSkuFullReductionEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 商品满减信息
 *
 * @author BigRookie
 * @email bigrookie36@gmile.com
 * @date 2020-06-06 17:06:35
 */
public interface SmsSkuFullReductionService extends IService<SmsSkuFullReductionEntity> {

    PageVo queryPage(QueryCondition params);
}

