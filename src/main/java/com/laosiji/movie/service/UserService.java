package com.laosiji.movie.service;


import com.laosiji.movie.interfaces.UserApi;
import com.laosiji.movie.model.LsjUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

//@Service
//public class UserService implements UserApi {


//    @Autowired
//    LsjUserMapper lsjUserMapper;


//    @Override
//    public  boolean isUserExist(String username){
//        Example example =new Example(LsjUser.class);
//        Example.Criteria criteria=example.createCriteria();
//        criteria.andEqualTo("username",username);
//        List<LsjUser>list=lsjUserMapper.selectByExample(example);
//        if (list.size()>0) {
//            return true; //已经存在该账户
//        }
//        return false;
//
//    }

//    @Transactional
//    @Override
//    public  int saveUser(LsjUser lsjUser){
//        int code=lsjUserMapper.insert(lsjUser);
//        return code;
//    }





//}
