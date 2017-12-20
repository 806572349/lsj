package com.laosiji.movie.interfaces;

import com.laosiji.movie.base.BaseService;
import com.laosiji.movie.model.LaosijiUser;

public interface UserApi extends BaseService {

//    User valitaUser(String userName) ;

    int RegisterUser(LaosijiUser laosijiUser);

    int RegisterBackUser(LaosijiUser laosijiUser);
}
