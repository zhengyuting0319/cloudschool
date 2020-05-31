package com.google.cloudschool.controller;

import com.alibaba.fastjson.JSONObject;
import com.google.cloudschool.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String welcomeLogin(){
        return "login";
    }

    @PostMapping("/login")
    @ResponseBody
    String ajaxLogin(String username, String password) {
        System.out.println("username="+username+" password="+password);
        int code = userService.login(username,password);
        System.out.println("code = "+code);
        JSONObject result = new JSONObject() ;
        result.put("code",code);
        if (code >= 1) {
            result.put("msg","登录成功！");
        }else {
            result.put("msg","用户或密码错误！");
        }
        return result.toJSONString();
    }
}

