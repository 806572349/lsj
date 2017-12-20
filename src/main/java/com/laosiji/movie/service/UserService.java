package com.laosiji.movie.service;


import com.laosiji.movie.entity.IUserInfo;
import com.laosiji.movie.interfaces.UserApi;
import com.laosiji.movie.model.LaosijiUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserService implements UserApi {

    @Autowired
    IUserInfo iUserInfo;




   /* @Override
    public User valitaUser(String userName)  {

        LaosijiUser laosijiUser = iUserInfo.findByUsername(userName);
        if (laosijiUser!=null){
            User user=new User(userName,pwsEncode.encode(laosijiUser.getPassword()),laosijiUser.isEnabled(),laosijiUser.isAccountNonExpired(),laosijiUser.isCredentialsNonExpired()
            ,laosijiUser.isAccountNonLocked(), AuthorityUtils.commaSeparatedStringToAuthorityList(laosijiUser.getHasRole())
            );
            laosijiUser.setLoginTime(new Date());
            iUserInfo.save(laosijiUser);
            return user;
        }
        return null;
//        else {
//           throw  new RuntimeException("无用户名");
//        }
    }*/
    @Override
    public int RegisterUser(LaosijiUser laosijiUser){
        LaosijiUser user = iUserInfo.findByUsername(laosijiUser.getUsername());
        if (user==null){
            laosijiUser.setEnabled(true);
            laosijiUser.setAccountNonExpired(true);
            laosijiUser.setAccountNonLocked(true);
            laosijiUser.setCredentialsNonExpired(true);
            laosijiUser.setCreateTime(new Date());
            laosijiUser.setHasRole("ROLE_USER");
            laosijiUser.setUserLeavl(0);
            laosijiUser.setPoint(10);
            iUserInfo.save(laosijiUser);
            return 0;
        }else {
            throw  new RuntimeException("已有该用户名");
        }
    }

    @Override
    public int RegisterBackUser(LaosijiUser laosijiUser){
        LaosijiUser user = iUserInfo.findByUsername(laosijiUser.getUsername());
        if (user==null){
            laosijiUser.setEnabled(true);
            laosijiUser.setAccountNonExpired(true);
            laosijiUser.setAccountNonLocked(true);
            laosijiUser.setCredentialsNonExpired(true);
            laosijiUser.setCreateTime(new Date());
            laosijiUser.setHasRole("ROLE_ADMIN");
            laosijiUser.setUserLeavl(0);
            laosijiUser.setPoint(10);
            iUserInfo.save(laosijiUser);
            return 0;
        }else {
            throw  new RuntimeException("已有该用户名");
        }
    }
/**
 * public User(String username, String password, boolean enabled,
 boolean accountNonExpired, boolean credentialsNonExpired,
 boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
 */

}
