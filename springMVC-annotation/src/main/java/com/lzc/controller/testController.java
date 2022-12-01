package com.lzc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @title: testController
 * @Author luozouchen
 * @Date: 2022/12/1 11:08
 */
@Controller
public class testController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
