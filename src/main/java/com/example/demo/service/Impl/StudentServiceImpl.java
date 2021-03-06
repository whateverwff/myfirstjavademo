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
        studentMapper.deleteCourseById(form.getId());
        form.getList().stream().peek(item->{
            Middletable middletable=new Middletable();
            middletable.setUid(form.getId());
            middletable.setCid(item);
            middletable.setIsread(0);
            middletable.setSubscribe(1);
            List<Middletable> m = studentMapper.selectCourseById(middletable);
            if(m == null || m.size() == 0){
                studentMapper.insertMiddletable(middletable);
            }else{
                studentMapper.updateMiddletable(middletable);
            }
        }).collect(Collectors.toList());
    }


    @Override
    public List<Map<String,Object>> getAllCourse() {
        return studentMapper.getAllCourse();
    }

    @Override
    public void setCourseReadByCid(String uid, String cid) {
        studentMapper.setCourseReadByCid(uid,cid);
    }

    @Override
    public List<Map<String, Object>> queryCourse() {
        return studentMapper.queryCourse();
    }
}
