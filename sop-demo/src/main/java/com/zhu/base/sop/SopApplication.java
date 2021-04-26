package com.zhu.base.sop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: ZhuHaiBo
 * @date: 2021/4/22  11:07
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SopApplication {
    public static void main(String[] args) {
        SpringApplication.run(SopApplication.class, args);
    }
}
