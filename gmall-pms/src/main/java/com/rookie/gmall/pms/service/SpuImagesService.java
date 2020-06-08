package com.rookie.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rookie.gmall.pms.entity.SpuImagesEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * spu图片
 *
 * @author BigRookie
 * @email bigrookie36@gmile.com
 * @date 2020-06-06 15:35:36
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageVo queryPage(QueryCondition params);
}

