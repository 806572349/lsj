package com.laosiji.movie;


import com.laosiji.movie.entity.IHeadInfo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan(basePackages = "com.laosiji.movie.entity")
public class App {

    public  static void main(String[] args){
        SpringApplication.run(App.class,args);


    }
}
