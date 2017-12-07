package com.laosiji.movie.utils;

import com.laosiji.movie.model.LsjUser;
import org.springframework.ui.ModelMap;

import java.util.Date;

public class ResultUtils {
    public  ModelMap map;


    public  static Results getFailResult(){
        Results result=new Results();
        result.setCode(1);
        result.setMsg("失败");
        return  result;

    }

    public  static Results getSuccessResult(){
        Results result=new Results();
        result.setCode(EnmuList.SUCCESS.getCode());
        result.setMsg(EnmuList.SUCCESS.getMsg());
        return  result;

    }

    public static LsjUser createUserModelMap(LsjUser lsjUser){
        lsjUser.setCreateTime(new Date());
        lsjUser.setPoint(0);
        lsjUser.setUserLeavl(0);
        return lsjUser;
    }

    /**
     *
     * @param isSuccess 成功的结果
     * @return
     */
    public static ModelMap getMap(boolean isSuccess){
        ModelMap map=new ModelMap();
        if (isSuccess){
            map.put("code",0);
            map.put("msg","Success");
            return map;
        }
        else {
            map.put("code",1);
            return map;
        }

    }

}
