package com.example.demo.mapper;

import com.example.demo.Entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
@Mapper
public interface LoginMapper {
    Map<String,Object> login(UserInfo userInfo);
}
