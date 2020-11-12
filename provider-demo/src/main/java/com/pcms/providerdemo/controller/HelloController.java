package com.pcms.providerdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 彭辉泉
 * @Date 2020/10/21 11:27
 * @Version 1.0
 * @Description 描述
 */
@Slf4j
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(@RequestParam String name) {
        log.info(name);
        return name;
    }
}

