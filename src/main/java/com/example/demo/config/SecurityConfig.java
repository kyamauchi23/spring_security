package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(WebSecurity web) throws Exception {
        //  (2) 主に全体に対するセキュリティ設定を行う
        web.ignoring().antMatchers("/css/**","/js/**","/images/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //  (3) 主にURLごとに異なるセキュリティ設定を行う
        http.authorizeRequests().antMatchers("/lp").permitAll()
                .anyRequest().authenticated();
    }

}
