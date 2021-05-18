package com.zhu.bootadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: ZhuHaiBo
 * @date: 2021/5/18  11:49
 */
@EnableDiscoveryClient
@SpringBootApplication
public class BootAdminClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootAdminClientApplication.class, args);
    }
}
