package com.pcms.consumerdemo.controller;

import com.pcms.consumerdemo.feigin.TestFeigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 彭辉泉
 * @Date 2020/10/21 11:46
 * @Version 1.0
 * @Description 描述
 */
@RestController
public class TestController {

    @Autowired
    private TestFeigin testFeigin;

    @RequestMapping("test")
    public String test() {
        return testFeigin.hello("hello");
    }
}

