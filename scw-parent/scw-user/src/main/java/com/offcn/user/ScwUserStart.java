package com.offcn.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther: lhq
 * @Date: 2020/10/22 10:40
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.offcn.user.mapper")
public class ScwUserStart {

    public static void main(String[] args) {
        SpringApplication.run(ScwUserStart.class);
    }
}
