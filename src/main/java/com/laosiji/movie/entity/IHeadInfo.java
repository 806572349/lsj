package com.laosiji.movie.entity;

import com.laosiji.movie.model.HeadInfo;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface IHeadInfo extends MongoRepository<HeadInfo,String> {



}
