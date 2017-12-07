package com.laosiji.movie.controller;


import com.laosiji.movie.interfaces.UserApi;
import com.laosiji.movie.model.LsjUser;
import com.laosiji.movie.utils.ResultUtils;
import com.laosiji.movie.utils.Results;
import com.laosiji.movie.utils.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;
@RestController
@RequestMapping(value = "/user",produces = "application/json;charset=utf-8")
public class UserController {

//    @Autowired
//    UserApi userApi;
//    @PostMapping("/register")
//    public String Register(HttpServletRequest request, LsjUser user) {
//        if (userApi.isUserExist(user.getUsername())) { //存在该用户名
//            Results result = ResultUtils.getFailResult();
//            return result.toJson();
//        }
//        LsjUser lsjUser = ResultUtils.createUserModelMap(user);
//        String sideWord = request.getHeader("User-Agent");
//        Map<String, String> token = TokenUtil.createToken(lsjUser, sideWord);
//        Results result = ResultUtils.getSuccessResult();
//        result.setData(token);
//        userApi.saveUser(lsjUser);
//        return result.toJson();
//
//    }
//
//    @PostMapping("login")
//    public ModelMap Login() {
//        ModelMap modelMap = new ModelMap();
//        return modelMap;
//
//    }

}
