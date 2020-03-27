package com.example.demo.Util;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Result implements Serializable  {

    public final static int successCode=200;
    public final static int failingCode=400;

    public static Map<String , Object> result(Object data,String message ,int resultCode ,Boolean success){
        Map<String,Object> result=new HashMap<>();
        result.put("success", success);
        result.put("statusCode", resultCode);
        result.put("message", message);
        result.put("data",data);
        return result;
    }

    public static Map<String , Object> successResult(String message,Object data){
        return result(data,message,successCode,true);
    }

    public static Map<String , Object> successResult(String message){
        return result(null,message,successCode,true);
    }

    public static Map<String , Object> failingResult(String message){
        return result(null,message,failingCode,false);
    }
}
