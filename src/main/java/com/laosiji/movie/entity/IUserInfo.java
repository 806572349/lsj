package com.laosiji.movie.entity;

import com.laosiji.movie.model.LaosijiUser;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface IUserInfo extends MongoRepository<LaosijiUser,String> {

    LaosijiUser findByUsername(String name);

}
