package com.lzc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @title: testController
 * @Author luozouchen
 * @Date: 2022/11/24 11:22
 */
@Controller
public class testController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

}
