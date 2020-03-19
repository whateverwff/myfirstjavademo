package com.example.demo.Util;

import java.io.Serializable;

public class Result implements Serializable  {

   public static final int CODE_SUCCESS = 200;  //成功
   public static final int CODE__ERROR= 400;  //失败



    private int code;
    private String errorMsg;
    private Exception e;
    private Boolean resultflag;

    public Result(int code, String errorMsg, Exception e, Boolean resultflag) {
        this.code = code;
        this.errorMsg = errorMsg;
        this.e = e;
        this.resultflag = resultflag;
    }

    public Result() {
        code=200;
        errorMsg="登录成功";
    }

    public Result(int code, String errorMsg, Exception e) {
        this.code = code;
        this.errorMsg = errorMsg;
        this.e = e;
    }

    public Result(int code, String errorMsg) {
        this.code = code;
        this.errorMsg = errorMsg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Exception getE() {
        return e;
    }

    public void setE(Exception e) {
        this.e = e;
    }

    public Boolean getResultflag() {
        return resultflag;
    }

    public void setResultflag(Boolean resultflag) {
        this.resultflag = resultflag;
    }
}
