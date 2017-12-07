package com.laosiji.movie.utils;

import com.google.gson.Gson;

public class Results {
    public  String Msg;
    public Integer Code;
    public Object data;

    public String getMsg() {
        return Msg;
    }

    public void setMsg(String msg) {
        Msg = msg;
    }

    public Integer getCode() {
        return Code;
    }

    public void setCode(Integer code) {
        Code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


    public String toJson(){
        Gson gson=new Gson();
        return gson.toJson(this);


    }
}
