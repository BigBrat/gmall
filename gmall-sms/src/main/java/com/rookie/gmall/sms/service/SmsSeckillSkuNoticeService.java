package com.rookie.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rookie.gmall.sms.entity.SmsSeckillSkuNoticeEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 秒杀商品通知订阅
 *
 * @author BigRookie
 * @email bigrookie36@gmile.com
 * @date 2020-06-06 17:06:35
 */
public interface SmsSeckillSkuNoticeService extends IService<SmsSeckillSkuNoticeEntity> {

    PageVo queryPage(QueryCondition params);
}

