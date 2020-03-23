package com.example.demo.controller;


import com.example.demo.Entity.User;
import com.example.demo.Util.Result;
import com.example.demo.service.StudentService;
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

    @RequestMapping("/student/query")
    public List<User> queryStudent(User ur) {
        List<User> user = studentService.queryUserList();
        return user;
    }

    @RequestMapping("/student/setreadstates")
    public void setReadStates(@RequestParam(value = "cid") String cid) {
        Integer result = studentService.setReadStates(cid);
    }


    @RequestMapping("/student/query1/{cid}")
    public User queryStudent(@PathVariable(value = "cid") String cid) {
        //List<User> list = new ArrayList<>();
        User user = studentService.queryUserList1(cid);
        // list.add(user);
        return user;
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
