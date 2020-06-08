package com.rookie.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rookie.gmall.sms.entity.SmsCouponHistoryEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 优惠券领取历史记录
 *
 * @author BigRookie
 * @email bigrookie36@gmile.com
 * @date 2020-06-06 17:06:35
 */
public interface SmsCouponHistoryService extends IService<SmsCouponHistoryEntity> {

    PageVo queryPage(QueryCondition params);
}

