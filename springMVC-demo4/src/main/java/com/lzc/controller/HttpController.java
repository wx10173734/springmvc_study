package com.lzc.controller;

import com.lzc.bean.User;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @title: HttpController
 * @Author luozouchen
 * @Date: 2022/11/27 22:02
 */
@Controller
public class HttpController {
    @PostMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String requestBody) {
        System.out.println("requestBody:" + requestBody);
        return "success";
    }

    @RequestMapping("/testRequestEntity")
    public String testRequestEntity(RequestEntity<String> requestEntity) {
        //当前requestEnity表示整个请求报文的信息
        System.out.println("requestHeader:" + requestEntity.getHeaders());
        System.out.println("requestBody:" + requestEntity.getBody());
        return "success";
    }

    @RequestMapping("/testResponse")
    public void testResponse(HttpServletResponse response) throws IOException {
        response.getWriter().println("hello,response");
    }

    @RequestMapping("/testResponseBody")
    @ResponseBody
    public String testResponseBody() {
        return "success";
    }

    @RequestMapping("/testResponseUser")
    @ResponseBody
    public User testResponseUser() {
        return new User(1001, "admin", "123456", 23, "男");
    }

    @PostMapping("/testAxios")
    @ResponseBody
    public String testAxios(String username, String password) {
        System.out.println(username + "," + password);
        return "hello,axios";
    }
}
