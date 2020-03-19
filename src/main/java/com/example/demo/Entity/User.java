package com.example.demo.Entity;

import java.util.List;

import java.io.Serializable;

public class User implements Serializable {

    private String cid;
    private String cname;
    private String credit;

    public String getCid() {
        return cid;
    }



    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "User{" +
                "cid='" + cid + '\'' +
                ", cname='" + cname + '\'' +
                ", credit='" + credit + '\'' +
                '}';
    }
}
