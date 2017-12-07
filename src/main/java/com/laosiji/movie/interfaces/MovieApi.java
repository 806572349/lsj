package com.laosiji.movie.interfaces;

import com.laosiji.movie.model.MovieInfo;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MovieApi {

    List<MovieInfo> queryByMovieName(String name);

    List<MovieInfo> getMovieIndex(Pageable pageable);

    List<MovieInfo> getMovieType(String type, Pageable pageable);


    MovieInfo getMovieInfo(String id);



    List<MovieInfo> getMovieTypeIndex(Pageable pageable, String... tag);
}
