package com.lzc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @title: HelloController
 * @Author luozouchen
 * @Date: 2022/11/24 10:52
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String index() {
        //返回视图名称
        return "index";
    }

    @RequestMapping("/target")
    public String toTarget() {
        return "target";
    }

}
