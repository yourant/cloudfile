package com.zhu.boot.demo;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: ZhuHaiBo
 * @date: 2021/4/28  15:01
 */
@Slf4j
@RestController
public class ProfileController {

    @Value("${my.diy.source}")
    private String source;

    @Value("${server.port}")
    private String serverPort;

    @Value("${spring.profiles.active}")
    private String profile;

    @GetMapping("/profileDemo")
    public String profileDemo() {
        return source + "-" + serverPort + "-" + profile;
    }

}
