package com.laosiji.movie.handler;

import com.laosiji.movie.utils.EnmuList;
import com.laosiji.movie.utils.ResultUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandle  {
    private static Logger lg= LoggerFactory.getLogger(ExceptionHandle.class);


    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ModelMap handle(Exception ex){
        ModelMap modelMap = ResultUtils.getMap(false);
        modelMap.put("msg",ex.getMessage());
        lg.error(ex.getMessage(),ex.fillInStackTrace());
        return modelMap;

    }
}
