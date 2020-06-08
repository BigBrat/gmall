package com.rookie.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rookie.gmall.pms.entity.SkuInfoEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * sku信息
 *
 * @author BigRookie
 * @email bigrookie36@gmile.com
 * @date 2020-06-06 15:35:36
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageVo queryPage(QueryCondition params);
}

