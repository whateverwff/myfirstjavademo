package com.example.demo.service;


import com.example.demo.controller.form.StudentCourseForm;

import java.util.List;
import java.util.Map;

public interface StudentService {

    List<Map<String,Object>> queryUserList(Integer id);

    void savaUserCourses(StudentCourseForm form);

    List<Map<String,Object>> getAllCourse();

    void setCourseReadByCid(String uid,String cid);
    List<Map<String,Object>> queryCourse();
}
