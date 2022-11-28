package com.lzc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @title: TestController
 * @Author luozouchen
 * @Date: 2022/11/28 15:23
 */
@Controller
public class TestController {
    @RequestMapping("/**/testInterceptor")
    public String testInterceptor() {
        return "success";
    }
}
