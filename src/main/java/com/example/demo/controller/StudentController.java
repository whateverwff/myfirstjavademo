package com.example.demo.controller;


import com.example.demo.Entity.User;
import com.example.demo.Util.Result;
import com.example.demo.controller.form.StudentCourseForm;
import com.example.demo.service.StudentService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    /**
     * 查询用户所选课程
     * @param ur
     * @return
     */
    @RequestMapping("/student/query")
    public List<User> queryStudent(User ur) {
        List<User> user = studentService.queryUserList();
        
        return user;
    }

    @RequestMapping("/student/userquery")
    public List<User> queryUserStudent(@RequestParam(value = "uid") String uid) {
        List<User> user = studentService.queryUserStudent(uid);
        return user;
    }

    @RequestMapping("/student/setreadstates")
    public void setReadStates(@RequestParam(value = "cid") String cid, @RequestParam(value = "uid") String uid) {
        Integer result = studentService.setReadStates(cid, uid);
    }


    @RequestMapping("/student/query1")
    public User queryStudent(@RequestParam(value = "uid") String uid) {
        //List<User> list = new ArrayList<>();
        User user = studentService.queryUserList1(uid);
        // list.add(user);
        return user;
    }

    /**
     * 保存用户所选课程
     * @param
     */
    @RequestMapping("/student/setcourse")
    public void setCourse(@RequestBody StudentCourseForm form){
        Integer result = studentService.setUserCourse(form);

    }


    @RequestMapping("/student/query2")
    public List<User> queryStudent1() {
        List<User> listUser = studentService.queryUserList2();
        return listUser;
    }


    @RequestMapping("/student/query3")
    public List<User> queryStudent3(HttpServletRequest request, HttpSession session) {
        List<User> listUser = studentService.queryUserList2();
        HttpSession session1 = request.getSession();
        session1.setAttribute("listuser", listUser);
        return listUser;
    }


}
