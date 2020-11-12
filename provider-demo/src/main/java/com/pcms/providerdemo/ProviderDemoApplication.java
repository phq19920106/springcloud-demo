package com.pcms.providerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author 彭辉泉
 * @Date 2020/10/21 11:11
 * @Version 1.0
 * @Description @EnableEurekaClient表示激活Eureka中的对注册中心服务实现
 */
@EnableEurekaClient
@SpringBootApplication
public class ProviderDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderDemoApplication.class, args);
    }

}
