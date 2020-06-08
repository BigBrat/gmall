package com.rookie.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rookie.gmall.pms.entity.BrandEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 品牌
 *
 * @author BigRookie
 * @email bigrookie36@gmile.com
 * @date 2020-06-06 15:35:36
 */
public interface BrandService extends IService<BrandEntity> {

    PageVo queryPage(QueryCondition params);
}

