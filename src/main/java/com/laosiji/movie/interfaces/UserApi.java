package com.laosiji.movie.interfaces;

import com.laosiji.movie.base.BaseService;
import com.laosiji.movie.model.LsjUser;

public interface UserApi extends BaseService {
    boolean isUserExist(String username);

    int saveUser(LsjUser lsjUser);
}
