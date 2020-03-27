package com.example.demo.mapper;


import com.example.demo.Entity.User;
import com.example.demo.controller.form.StudentCourseForm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface StudentMapper {

    List<User> queryStudentList();

    User queryStudentList1(String cid);

    List<User> queryStudentList2();

    Integer setReadStates(String cid, String uid);

    List<User> queryUserStudent(String uid);

    Integer setUserCourse(StudentCourseForm form);
}
