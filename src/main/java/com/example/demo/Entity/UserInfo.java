package com.example.demo.Entity;

public class UserInfo {
    private  int id;
    private String username;
    private String psd;

    public UserInfo(int id, String username, String psd) {
        this.id = id;
        this.username = username;
        this.psd = psd;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPsd() {
        return psd;
    }

    public void setPsd(String psd) {
        this.psd = psd;
    }
}
