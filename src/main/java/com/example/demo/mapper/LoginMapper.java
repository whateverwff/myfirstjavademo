package com.example.demo.mapper;

import com.example.demo.Entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository
@Mapper
public interface LoginMapper {
    UserInfo login(UserInfo userInfo);
    Integer register(UserInfo userinfo);
}
