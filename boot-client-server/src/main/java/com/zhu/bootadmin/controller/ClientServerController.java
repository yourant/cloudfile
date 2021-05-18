package com.zhu.bootadmin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: ZhuHaiBo
 * @date: 2021/5/18  11:50
 */
@Slf4j
@RestController
public class ClientServerController {

    @GetMapping("/info")
    public Object info() {
        log.info("info=====================================");
        return "info";
    }

    @GetMapping("/errorPage")
    public Object error() {
        log.error("error=====================================");
        return "error";
    }

    @GetMapping("/warn")
    public Object warn() {
        log.warn("warn=====================================");
        return "warn";
    }


}
