package com.example.demo.service;


import com.example.demo.Entity.User;
import java.util.List;

public interface StudentService {

    List<User> queryUserList();
     User queryUserList1(String cid);
    List<User> queryUserList2();
}
