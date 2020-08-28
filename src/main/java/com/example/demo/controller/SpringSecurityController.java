package com.example.demo.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
