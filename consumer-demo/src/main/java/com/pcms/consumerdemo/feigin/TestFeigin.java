package com.pcms.consumerdemo.feigin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author 彭辉泉
 * @Date 2020/10/21 11:44
 * @Version 1.0
 * @Description 描述
 */
@FeignClient(name = "provider-demo")
public interface TestFeigin {

    /**
     * 测试feigin
     * @param name
     * @return 保证该抽象方法与生产者服务中的方法完全相同
     */
    @RequestMapping("/hello")
    String hello(@RequestParam String name);
}

