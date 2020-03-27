package com.example.demo.service.Impl;


import com.example.demo.Entity.User;
import com.example.demo.controller.form.StudentCourseForm;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;


    @Override
    public List<User> queryUserList() {

          return studentMapper.queryStudentList();

    }

    @Override
    public List<User> queryUserList2() {
        List<User> listUser = studentMapper.queryStudentList2();
        return listUser;
    }

    @Override
    public Integer setReadStates(String cid,String uid) {
        return studentMapper.setReadStates(cid,uid);
    }

    @Override
    public List<User> queryUserStudent(String uid) {
        return studentMapper.queryUserStudent(uid);
    }

    @Override
    public Integer setUserCourse(StudentCourseForm form) {
        return studentMapper.setUserCourse(form);
    }

    @Override
    public User queryUserList1(String cid) {
     return studentMapper.queryStudentList1(cid);

    }




}
