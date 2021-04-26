package com.zhu.base.sop.controller;

import com.gitee.sop.servercommon.annotation.Open;
import com.zhu.base.entity.BaseEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


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

    @Open(value = "getMapParam")
    @PostMapping("/getMapParam")
    public BaseEntity getMapParam() {
        Map<String, String> map = new HashMap<>();
        map.put("A", "A");
        map.put("B", "B");
        return BaseEntity.builder().id(1).username("admin").info(map).build();
    }

}


