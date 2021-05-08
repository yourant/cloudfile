package com.zhu.sop.cluster.controller;

import com.gitee.sop.servercommon.annotation.Open;
import com.zhu.base.entity.BaseEntity;
import com.zhu.base.util.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: ZhuHaiBo
 * @date: 2021/4/30  15:01
 */
@Slf4j
@RestController
public class FirstController {

    //@Open(value = "sop.cluster", version = "1.0")
    //@GetMapping("/getCluster1")
    //public ResultUtil<BaseEntity> getCluster1() {
    //    log.info("请求到达Cluster3, Version = 1.0");
    //    BaseEntity baseEntity = BaseEntity.builder().id(3003).username("Cluster3").build();
    //    return ResultUtil.success(baseEntity);
    //}

    @Open(value = "sop.cluster", version = "2.0")
    @GetMapping("/getCluster2")
    public ResultUtil<BaseEntity> getCluster2() {
        log.info("请求到达Cluster3, Version = 2.0");
        BaseEntity baseEntity = BaseEntity.builder().id(3003).username("Cluster3").build();
        return ResultUtil.success(baseEntity);
    }
}
