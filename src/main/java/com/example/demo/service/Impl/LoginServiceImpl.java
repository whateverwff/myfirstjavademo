package com.example.demo.service.Impl;

import com.example.demo.Entity.UserInfo;
import com.example.demo.mapper.LoginMapper;
import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public class LoginServiceImpl implements LoginService {


    @Autowired
    private LoginMapper loginmapper;


    @Override
    public Map<String, Object> login(UserInfo userInfo) {
       return  loginmapper.login(userInfo);

    }
}
