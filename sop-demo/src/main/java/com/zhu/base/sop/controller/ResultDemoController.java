package com.zhu.base.sop.controller;

import com.zhu.base.entity.BaseEntity;
import com.zhu.base.util.ResultUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: ZhuHaiBo
 * @date: 2021/4/27  14:26
 */
@RestController
public class ResultDemoController {

    @PostMapping("/result")
    public ResultUtil<BaseEntity> getBaseInfo() {
        return ResultUtil.success(BaseEntity.builder().id(100).username("admin").build());
    }

}
