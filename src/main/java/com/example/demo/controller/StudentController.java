package com.example.demo.controller;


import com.example.demo.Entity.Course;
import com.example.demo.Util.Result;
import com.example.demo.controller.form.StudentCourseForm;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

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

    /**
     *设为已学
     */
    @RequestMapping("/student/setreadstates")
    public void setCourseReadByCid(@RequestParam("uid") String uid,@RequestParam("cid") String cid){
        studentService.setCourseReadByCid(uid,cid);
    }

    /**
     * 获取用户所有课程
     */
    @RequestMapping("/student/getallcoursebyid")
    public Map<String,Object> getAllCourseById(Integer id){
        List<Map<String,Object>> result = studentService.queryUserList(id);
        return Result.successResult("success",result);
    }

    /**
     * 获取课程表所有课程
     * @return
     */
    @RequestMapping("/student/getallcourse")
    public Map<String,Object> getAllCourse(){
        List<Map<String,Object>> list = studentService.queryCourse();
        return Result.successResult("success",list);
    }

    /**
     * 保存用户选择的课程
     * @param form
     * @return
     */
    @PostMapping("/student/userCourses")
    public Map<String, Object> saveUserCourses(@RequestBody StudentCourseForm form) {
        if(form == null){
            return Result.failingResult("用户为空");
        }
        studentService.savaUserCourses(form);
        return Result.successResult("success");
    }
}
