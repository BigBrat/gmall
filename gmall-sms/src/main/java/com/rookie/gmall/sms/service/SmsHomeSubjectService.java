package com.rookie.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rookie.gmall.sms.entity.SmsHomeSubjectEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author BigRookie
 * @email bigrookie36@gmile.com
 * @date 2020-06-06 17:06:35
 */
public interface SmsHomeSubjectService extends IService<SmsHomeSubjectEntity> {

    PageVo queryPage(QueryCondition params);
}

