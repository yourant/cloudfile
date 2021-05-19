package com.zhu.sop.cluster.controller;


import com.gitee.sop.servercommon.annotation.Open;
import com.zhu.base.entity.BaseEntity;
import com.zhu.base.util.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: ZhuHaiBo
 * @date: 2021/4/30  15:01
 */
@Slf4j
@RestController
public class FirstController {

    @Value("${server.port}")
    private String serverPort;

    @Value("${share}")
    private String share;

    @Open(value = "sop.cluster", version = "1.0")
    @GetMapping("/getCluster1")
    public ResultUtil<BaseEntity> getCluster1(@RequestBody BaseEntity tempBody, HttpServletRequest request) {
        request.getParameter("params");
        log.info("请求到达7001 Cluster1, Version = 1.0,params = {}", "prarms");
        BaseEntity baseEntity = BaseEntity.builder().id(1001).username("请求到达7001 Cluster1, Version = 1.0").build();
        return ResultUtil.success(baseEntity);
    }

    @Open(value = "sop.cluster", version = "2.0")
    @GetMapping("/getCluster2")
    public ResultUtil<BaseEntity> getCluster2() {
        log.info("请求到达7001 Cluster1, Version = 2.0");
        BaseEntity baseEntity = BaseEntity.builder().id(1001).username("请求到达7001 Cluster1, Version = 2.0").build();
        return ResultUtil.success(baseEntity);
    }

    @GetMapping("/getShare")
    public void getShare() {
        log.info("serverPort:{}，share：{}", serverPort, share);
    }
}
