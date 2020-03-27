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

    /**
     * 登录
     * @param userinfo
     * @return
     */
    @RequestMapping("/login")
    public Map<String,Object> login(@RequestBody UserInfo userinfo) {
        UserInfo result = loginService.login(userinfo);
        if (result != null) {
            result.setPsd(null);
            return Result.successResult("登陆成功",result);
        }
        return Result.failingResult("用户名或密码错误");

    }

    /**
     * 注册
     * @param userinfo
     * @return
     */
    @RequestMapping("/register")
    public Map<String,Object> register(@RequestBody UserInfo userinfo) {
        Integer result = loginService.register(userinfo);
        if (result == 1) {
            return Result.successResult("注册成功");
        }
        return Result.failingResult("注册失败");
    }

}
