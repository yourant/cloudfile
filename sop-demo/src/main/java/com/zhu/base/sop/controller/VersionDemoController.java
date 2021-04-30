package com.zhu.base.sop.controller;

import com.gitee.sop.servercommon.annotation.Open;
import com.zhu.base.entity.BaseEntity;
import com.zhu.base.util.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: ZhuHaiBo
 * @date: 2021/4/30  14:26
 */
@Slf4j
@RestController
public class VersionDemoController {

    @Open(value = "sop.demo.getResult", version = "1.0")
    @GetMapping("/getLevelOne")
    public ResultUtil<BaseEntity> getLevelOneResult() {
        BaseEntity baseEntity = BaseEntity.builder().id(1001).username("admin").build();
        return ResultUtil.success(baseEntity);
    }

    @Open(value = "sop.demo.getResult", version = "2.0")
    @GetMapping("getLevelTwo")
    public ResultUtil<BaseEntity> getLevelTwoResult() {
        BaseEntity baseEntity = BaseEntity.builder().id(2002).username("AdminUser").build();
        return ResultUtil.success(baseEntity);
    }

}
