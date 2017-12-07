package com.laosiji.movie.utils;

public enum   EnmuList {
    FAILE(1,"失败"),
    SUCCESS(0,"成功"),


    ;
    private Integer code;
    private  String msg;

    EnmuList(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }


}
