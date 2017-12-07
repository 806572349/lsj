package com.laosiji.movie.service;

import com.laosiji.movie.base.Constaint;
import com.laosiji.movie.entity.IMovieInfo;
import com.laosiji.movie.interfaces.MovieApi;
import com.laosiji.movie.model.MovieInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService implements MovieApi {
    List<MovieInfo> list=new ArrayList<>();
    Pageable pageable;
    private Logger logger= LoggerFactory.getLogger(getClass());
    public Pageable getPageable() {
        return pageable;
    }

    public void setPageable(Pageable pageable) {
        this.pageable = pageable;
    }

    public List<MovieInfo> getList() {
        return list;
    }

    @Autowired
    IMovieInfo iMovieInfo;

    @Override
    public List<MovieInfo> queryByMovieName(String name) {
        List<MovieInfo> list= iMovieInfo.findByMovieNameLike(name);
        return list;
    }

    @Override
    public  List<MovieInfo> getMovieIndex(Pageable pageable){
        Page<MovieInfo> li=iMovieInfo.findAll(pageable);
        Iterator<MovieInfo> iterator = li.iterator();
        List<MovieInfo> list=new ArrayList<>();
        while (iterator.hasNext()){
            list.add(iterator.next());
        }

        return list;

    }
    @Override
    public  List<MovieInfo> getMovieType(String type,Pageable pageable){
        Page<MovieInfo> movieType = iMovieInfo.findByMovieTypeOrderByMovieUpdateTimeDesc(type, pageable);
        Iterator<MovieInfo> iterator = movieType.iterator();
        List<MovieInfo> list=new ArrayList<>();
        while (iterator.hasNext()){
            list.add(iterator.next());
        }
        return  list;
    }
    @Override
    public  MovieInfo getMovieInfo(String id){
        Optional<MovieInfo> movieInfo = iMovieInfo.findById(id);
        MovieInfo movieInfo1 = movieInfo.get();
        return movieInfo1;


    }
    @Override
    public  List<MovieInfo> getMovieTypeIndex(Pageable pageable, String... types){

//        Sort sort = new Sort(Sort.Direction.DESC, "movieUpdateTime");
//        Pageable pageable = new PageRequest(1, 4, sort);
        this.setPageable(pageable);
        return  getMovieTypeIndex(types).getList();
    }

    public MovieService getMovieTypeIndex(String... types){
        list.removeAll(list);
        for (String type:types) {
            logger.info("type:"+type);
            Page<MovieInfo> movieType = iMovieInfo.findByMovieTypeOrderByMovieUpdateTimeDesc(type, pageable);
            Iterator<MovieInfo> iterator = movieType.iterator();
            while (iterator.hasNext()){
                list.add(iterator.next());
            }
        }


        return this;
    }



}
