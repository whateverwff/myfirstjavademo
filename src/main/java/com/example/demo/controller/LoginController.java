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
        UserInfo result = loginService.login(userinfo);
        if(result != null){
           return new Result(Result.CODE_SUCCESS,"登录成功");
        }
        return new Result(Result.CODE__ERROR , "账号或密码错误");

    }


    @RequestMapping("/register")
    public Result register(@RequestBody UserInfo userinfo){
        Integer result = loginService.register(userinfo);
        if(result == 1){
            return new Result(Result.CODE_SUCCESS,"注册成功");
        }
        return new Result(Result.CODE__ERROR,"注册失败");
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }

}
