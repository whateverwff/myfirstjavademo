package com.example.demo.service;

import com.example.demo.Entity.UserInfo;

import java.util.Map;

public interface LoginService {
    Map<String,Object> login(UserInfo userInfo);
}
