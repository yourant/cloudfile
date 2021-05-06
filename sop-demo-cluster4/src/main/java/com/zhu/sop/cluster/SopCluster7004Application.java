package com.zhu.sop.cluster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: ZhuHaiBo
 * @date: 2021/4/30  15:04
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SopCluster7004Application {
    public static void main(String[] args) {
        SpringApplication.run(SopCluster7004Application.class, args);
    }
}
