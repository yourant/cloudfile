package com.zhu.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.gitee.sop.servercommon.annotation.Open;
import com.zhu.entity.BaseEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * @author: ZhuHaiBo
 * @date: 2021/4/22  11:10
 */
@Slf4j
@RestController
public class FirstDemoController {

    @Open(value = "sop.first")
    @PostMapping(value = "/first")
    public Object getStart() {
        return new BaseEntity(1, "admin");
    }

}


