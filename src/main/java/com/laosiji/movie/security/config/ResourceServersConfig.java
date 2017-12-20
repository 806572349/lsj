package com.laosiji.movie.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;

import javax.servlet.http.HttpServletResponse;

@Configuration
@EnableResourceServer
public class ResourceServersConfig extends ResourceServerConfigurerAdapter{

//    @Autowired
//    private RedisConnectionFactory redisConnectionFactory;
    @Bean
    public TokenStore jwtTokenStore(){
        return new JwtTokenStore(jwtAccessTokenConverter());
    }
    @Bean
    public JwtAccessTokenConverter jwtAccessTokenConverter(){
        JwtAccessTokenConverter jwtAccessTokenConverter = new JwtAccessTokenConverter();
        jwtAccessTokenConverter.setSigningKey("laosiji");
        return  jwtAccessTokenConverter;

    }
    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
//        super.configure(resources);
        resources.resourceId("oauth2-resource").tokenStore(jwtTokenStore());
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
//        super.configure(http);
        http
//                .formLogin()
//                .failureUrl("/user/loginrequire")
//                .and()

                .authorizeRequests().antMatchers("/user/register","/user/registerback","/swagger-ui.html").permitAll()
                .antMatchers("/movie/indexMovie").access("hasRole('ADMIN')")//授权
                .anyRequest().authenticated();
    }
}
