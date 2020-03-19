package com.example.demo.controller;

import com.example.demo.Entity.UserInfo;
import com.example.demo.Util.Result;
import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/login")
    public Result login(@RequestBody UserInfo userinfo){
        Map<String, Object> result = loginService.login(userinfo);
        if(result != null){
           return new Result();
        }
        return new Result(Result.CODE__ERROR , "登录失败请检查");

    }
}
