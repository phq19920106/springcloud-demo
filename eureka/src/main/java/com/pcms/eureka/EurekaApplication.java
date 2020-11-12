package com.pcms.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * @Author 彭辉泉
 * @Date 2020/10/21 10:37
 * @Version 1.0
 * @Description @EnableEurekaServer表示这是一个Eureka注册中心
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }

}
