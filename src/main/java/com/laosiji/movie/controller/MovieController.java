package com.laosiji.movie.controller;


import com.laosiji.movie.base.BaseController;
import com.laosiji.movie.base.Constaint;
import com.laosiji.movie.entity.IMovieInfo;
import com.laosiji.movie.interfaces.MovieApi;
import com.laosiji.movie.model.MovieInfo;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 这是对象上面的注解，可以在接口文档直接生成相应的描述文字
 *@ApiModelProperty(value = "xxx")
 */

@Api(value = "电影相关",description = "电影有关的都在这里")
@RestController
@RequestMapping(value = "/movie", produces = "application/json;charset=utf-8")
public class MovieController extends BaseController {

    @Autowired
    IMovieInfo iMovieInfo;

    @Autowired
    MovieApi movieApi;


    //查询
    @ApiOperation(value = "搜索影片",notes = "根据影片名搜索")
    @ApiImplicitParams({@ApiImplicitParam(name = "name",value = "影片名字",required = true,paramType = "query")})
    @PostMapping("searchmovie")
    public ModelMap searchMovie(@RequestParam String name) {
        ModelMap modelMap = getMap(true);
        List<MovieInfo> list = movieApi.queryByMovieName(name);
        if (list.size() != 0) {
            modelMap.put("data", list);
        } else {
            modelMap.put("data", "未找到该影片");
        }
        return modelMap;

    }

    //首页
    @ApiOperation(value = "首页",notes = "获取首页信息")
    @ApiImplicitParams({@ApiImplicitParam(name = "page",value = "第几页",paramType="query",required = true),
            @ApiImplicitParam(name = "size",value ="总数",paramType = "query",required = true)
    })
    @PostMapping("indexMovie")
    public ModelMap MovieIndex(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size) {
        ModelMap modelMap = getMap(true);
        Sort sort = new Sort(Sort.Direction.DESC, "movieUpdateTime");
        Pageable pageable2 = new PageRequest(page, size, sort);
        List<MovieInfo> list = movieApi.getMovieIndex(pageable2);
        HashMap<String, List> hashMap = new HashMap<>();
        hashMap.put("movieinfo", list);
        hashMap.put("head", getHeadList());
        modelMap.put("data", hashMap);

        return modelMap;
    }

    //类型
    @ApiOperation(value = "类型",notes = "电影类型信息")
    @ApiImplicitParams({@ApiImplicitParam(name = "type",value = "电影类型",paramType="query",required = true),
            @ApiImplicitParam(name = "size",value ="总数",paramType = "query",required = true),
            @ApiImplicitParam(name = "page",value = "第几页",paramType="query",required = true)
    })
    @PostMapping("movieType")
    public ModelMap MovieType(@RequestParam String type, Pageable pageable) {
        List<MovieInfo> movieType = movieApi.getMovieType(type, pageable);
        ModelMap modelMap = getMap(true);
        modelMap.put("data", movieType);
        return modelMap;
    }

    //详情
    @ApiOperation(value = "详情",notes = "电影详情信息")
    @ApiImplicitParams({@ApiImplicitParam(name = "id",value = "电影id",paramType="query",required = true),
    })
    @PostMapping("movieInfo")
    public ModelMap MovieInfo(@RequestParam String id) {
        ModelMap modelMap = getMap(true);
        MovieInfo movieInfo = movieApi.getMovieInfo(id);
        modelMap.put("data", movieInfo);
        return modelMap;
    }

    //播放
    @ApiOperation(value = "播放",notes = "电影播放页面")
    @ApiImplicitParams({@ApiImplicitParam(name = "mivieSrc",value = "电影地址",paramType="query",required = true),
    })
    @GetMapping("playMovie")
    public ModelAndView MoviePlay(@RequestParam String mivieSrc) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        System.out.println(mivieSrc);
        modelAndView.addObject("urlss", mivieSrc);
        return modelAndView;
    }

    @ApiOperation(value = "电视剧电影栏目",notes = "电视分类数据每类四个")
    @ApiImplicitParams({@ApiImplicitParam(name ="types",value = "是String数组,里面有每种电视剧类型名称",required = true,paramType ="query" ),
            @ApiImplicitParam(name = "page",value = "第几页",required = true,paramType = "query"),
            @ApiImplicitParam(name = "size",value = "一页总数量",required = true,paramType = "query")
    })
    @PostMapping("/TvAndMovieInfo")
    public ModelMap getTvInfo(Pageable pageable,@RequestParam String... types){

        List<MovieInfo> movieType = movieApi.getMovieTypeIndex(pageable,types);
        ModelMap modelMap = getMap(true);
        modelMap.put("data", movieType);
        return modelMap;
    }

}
