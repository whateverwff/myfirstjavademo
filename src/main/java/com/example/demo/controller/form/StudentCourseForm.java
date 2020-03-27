package com.example.demo.controller.form;

import java.util.List;

public class StudentCourseForm {
    /**用户id*/
    private Integer id;
    /**课程id*/
    private List<Integer> list;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }
}
