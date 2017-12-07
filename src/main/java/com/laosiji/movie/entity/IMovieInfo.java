package com.laosiji.movie.entity;

import com.laosiji.movie.model.MovieInfo;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Date;
import java.util.List;

public interface IMovieInfo extends MongoRepository<MovieInfo,String>{
    List<MovieInfo> findByMovieName(String name);
    List<MovieInfo> findByMovieType(String name);
    List<MovieInfo> findByMovieNameLike(String name);
    Page<MovieInfo> findByMovieTypeOrderByMovieUpdateTimeDesc(String name,Pageable pageable);
}
