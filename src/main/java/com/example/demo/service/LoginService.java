package com.example.demo.service;

import com.example.demo.Entity.UserInfo;


public interface LoginService {
    UserInfo login(UserInfo userInfo);
    Integer register(UserInfo userInfo);
}
