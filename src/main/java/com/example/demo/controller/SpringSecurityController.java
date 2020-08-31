package com.example.demo.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringSecurityController {

    @GetMapping
    public String test(){
        return "test";
    }

    @GetMapping("/lp")
    public String lp(){
        return "lp";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/login-success")
    public String loginSuccess(){
        return "login-success";
    }

    @GetMapping("/login-error")
    public String loginError(){
        return "login-error";
    }

    @GetMapping("/logout")
    public String logout(){
        return "logout";
    }

    @GetMapping("/logout-success")
    public String logoutSuccess(){
        return "logout-success";
    }

    @GetMapping("/timeout")
    public String timeout(){
        return "timeout";
    }

    @GetMapping("/admin")
    public String admin(@AuthenticationPrincipal User user){
        System.out.println(user);
        return "admin/admin";
    }

    @GetMapping("/success")
    public String success(){
        return "success";
    }
}
