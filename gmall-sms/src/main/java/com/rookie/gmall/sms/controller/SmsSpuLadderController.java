package com.rookie.gmall.sms.controller;

import java.util.Arrays;
import java.util.Map;


import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.atguigu.core.bean.Resp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.rookie.gmall.sms.entity.SmsSpuLadderEntity;
import com.rookie.gmall.sms.service.SmsSpuLadderService;




/**
 * 商品阶梯价格
 *
 * @author BigRookie
 * @email bigrookie36@gmile.com
 * @date 2020-06-06 17:06:35
 */
@Api(tags = "商品阶梯价格 管理")
@RestController
@RequestMapping("sms/smsspuladder")
public class SmsSpuLadderController {
    @Autowired
    private SmsSpuLadderService smsSpuLadderService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('sms:smsspuladder:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = smsSpuLadderService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('sms:smsspuladder:info')")
    public Resp<SmsSpuLadderEntity> info(@PathVariable("id") Long id){
		SmsSpuLadderEntity smsSpuLadder = smsSpuLadderService.getById(id);

        return Resp.ok(smsSpuLadder);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sms:smsspuladder:save')")
    public Resp<Object> save(@RequestBody SmsSpuLadderEntity smsSpuLadder){
		smsSpuLadderService.save(smsSpuLadder);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('sms:smsspuladder:update')")
    public Resp<Object> update(@RequestBody SmsSpuLadderEntity smsSpuLadder){
		smsSpuLadderService.updateById(smsSpuLadder);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sms:smsspuladder:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		smsSpuLadderService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
