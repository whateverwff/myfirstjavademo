package com.example.demo.mapper;


import com.example.demo.Entity.Course;
import com.example.demo.controller.form.StudentCourseForm;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface StudentMapper {

    List<Map<String,Object>> queryStudentList(Integer id);

}
