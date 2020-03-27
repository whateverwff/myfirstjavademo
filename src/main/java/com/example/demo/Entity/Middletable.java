package com.example.demo.Entity;

public class Middletable {
    private int id;
    private int uid;
    private int cid;
    private int isread;
    private int subscribe;

    public Middletable() {
    }

    public Middletable(int id, int uid, int cid, int isread, int subscribe) {
        this.id = id;
        this.uid = uid;
        this.cid = cid;
        this.isread = isread;
        this.subscribe = subscribe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getIsread() {
        return isread;
    }

    public void setIsread(int isread) {
        this.isread = isread;
    }

    public int getSubscribe() {
        return subscribe;
    }

    public void setSubscribe(int subscribe) {
        this.subscribe = subscribe;
    }
}
