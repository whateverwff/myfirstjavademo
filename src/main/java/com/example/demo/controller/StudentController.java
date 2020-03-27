package com.example.demo.controller;


import com.example.demo.Util.Result;
import com.example.demo.controller.form.StudentCourseForm;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    /**
     * 查询用户所选课程
     * @param id 用户id
     * @return
     */
    @PostMapping("/student/query")
    public Map<String, Object> queryStudent(Integer id) {
        if(id==null){
            return Result.failingResult("用户id不能为空");
        }
        List<Map<String,Object>> result = studentService.queryUserList(id);
        return Result.successResult("success",result);
    }

    @PostMapping("/save/userCourses")
    public Map<String, Object> saveUserCourses(@RequestBody StudentCourseForm form) {
        studentService.savaUserCourses(form);
        return Result.successResult("success");
    }
}
