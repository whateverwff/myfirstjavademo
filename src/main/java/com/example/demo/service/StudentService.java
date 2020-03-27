package com.example.demo.service;


import com.example.demo.Entity.User;
import com.example.demo.controller.form.StudentCourseForm;

import java.util.List;

public interface StudentService {

    List<User> queryUserList();

    User queryUserList1(String cid);

    List<User> queryUserList2();

    Integer setReadStates(String cid,String uid);

    List<User> queryUserStudent(String uid);

    Integer setUserCourse(StudentCourseForm form);
}
