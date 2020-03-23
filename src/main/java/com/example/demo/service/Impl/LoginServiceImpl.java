package com.example.demo.service.Impl;

import com.example.demo.Entity.UserInfo;
import com.example.demo.Util.MD5Util;
import com.example.demo.mapper.LoginMapper;
import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.util.Map;
@Service
public class LoginServiceImpl implements LoginService {


    @Autowired
    private LoginMapper loginmapper;


    @Override
    public UserInfo login(UserInfo userInfo) {
        try {
            userInfo.setPsd(MD5Util.getEncryption(userInfo.getPsd()));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return  loginmapper.login(userInfo);

    }

    @Override
    public Integer register(UserInfo userInfo) {
        UserInfo i = loginmapper.registerVerify(userInfo.getUsername());
        if (i != null) {
            return 0;
        }
        try {
            userInfo.setPsd(MD5Util.getEncryption(userInfo.getPsd()));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return loginmapper.register(userInfo);
    }
}
