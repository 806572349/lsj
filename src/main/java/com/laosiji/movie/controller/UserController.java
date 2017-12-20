package com.laosiji.movie.controller;


import com.laosiji.movie.base.BaseController;
import com.laosiji.movie.interfaces.UserApi;
import com.laosiji.movie.model.LaosijiUser;
import com.laosiji.movie.utils.ResultUtils;
import com.laosiji.movie.utils.Results;
import com.laosiji.movie.utils.TokenUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;
@Api(value = "用户相关",description = "用户相关的都在这里")
@RestController
@RequestMapping(value = "/user",produces = "application/json;charset=utf-8")
public class UserController extends BaseController{

    @Autowired
    UserApi userApi;

    @ApiOperation(value = "注册",notes = "用户注册")
    @ApiImplicitParams({@ApiImplicitParam(name = "username",value = "用户名",required = true,paramType = "query")
        ,@ApiImplicitParam(name = "password" ,value = "用户名",required = true,paramType = "query")
    })
    @PostMapping("/register")
    public ModelMap Register(LaosijiUser user) {
        userApi.RegisterUser(user);
        ModelMap modelMap = getMap(true);
        return modelMap;
    }

   /* @GetMapping("/loginrequire")
    public ModelMap Login() {
        ModelMap map = getFileMap(false,"需要登录才能访问");
        return map;
    }*/

    @ApiOperation(value = "后台用户注册",notes = "后台用户注册")
    @ApiImplicitParams({@ApiImplicitParam(name = "username",value = "用户名",required = true,paramType = "query")
            ,@ApiImplicitParam(name = "password" ,value = "用户名",required = true,paramType = "query")
    })
    @PostMapping("/registerback")
    public ModelMap RegisterBack(LaosijiUser user) {
        userApi.RegisterBackUser(user);
        ModelMap modelMap = getMap(true);
        return modelMap;
    }

}
