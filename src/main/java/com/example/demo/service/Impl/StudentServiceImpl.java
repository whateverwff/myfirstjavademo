package com.example.demo.service.Impl;


import com.example.demo.Entity.Course;
import com.example.demo.controller.form.StudentCourseForm;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Map<String,Object>> queryUserList(Integer id) {
        return studentMapper.queryStudentList(id);
    }
}
