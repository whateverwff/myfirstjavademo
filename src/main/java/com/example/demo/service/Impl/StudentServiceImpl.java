package com.example.demo.service.Impl;


import com.example.demo.Entity.Middletable;
import com.example.demo.controller.form.StudentCourseForm;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Map<String,Object>> queryUserList(Integer id) {
        return studentMapper.queryStudentList(id);
    }

    @Override
    public void savaUserCourses(StudentCourseForm form) {
        form.getList().stream().peek(item->{
            Middletable middletable=new Middletable();
            middletable.setUid(form.getId());
            middletable.setCid(item);
            middletable.setIsread(0);
            middletable.setSubscribe(1);
            studentMapper.insertMiddletable(middletable);
        }).collect(Collectors.toList());
    }
}
