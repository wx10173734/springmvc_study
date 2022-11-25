package com.lzc.controller;

import com.lzc.controller.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @title: ParamController
 * @Author luozouchen
 * @Date: 2022/11/26 0:26
 */
@Controller
public class ParamController {
    @RequestMapping("/testServletApi")
    //形参位置的request表示当前请求
    public String testServletApi(HttpServletRequest request) {
        HttpSession session = request.getSession();

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username:" + username + "password:" + password);
        return "success";
    }

    @RequestMapping("/testParam")
    public String testParam(@RequestParam(value = "user_name", required = false, defaultValue = "hehe") String username,
                            String password,
                            String hobby,
                            @RequestHeader("Host") String host,
                            @CookieValue("JSESSIONID") String JSESSIONID) {
        //多请求参数中出现多个同名的请求参数，可以再控制器方法的形参位 置设置字符串类型或字符串数组接受此字符参数
        //若使用字符串类型的形参，最终结果为请求参数的每一个值之间使用逗 号进行拼接
        System.out.println("username:" + username + ",password:" + password + ",hobby" + hobby);
        System.out.println("host:" + host);
        System.out.println("JSESSIONID:" + JSESSIONID);
        return "success";
    }

    @RequestMapping("/testBean")
    public String testBean(User user) {
        System.out.println(user);
        return "success";
    }


}
