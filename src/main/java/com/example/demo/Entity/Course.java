package com.example.demo.Entity;

/**
 * 描述:
 *
 * @author Administrator
 * @create 2020/03/27 13:52
 */
public class Course {
    private Integer cid;

    private String cname;

    public Course() {
    }

    public Course(Integer cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
