package com.cos.blog.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//인증이 안된 사용자들이 출입할 수있는 경로를 /auth.**허용

@Controller
public class UserController {

    @GetMapping("/auth/joinForm")
    public String JoinForm(){
        return "user/joinForm";
    }

    @GetMapping("/auth/loginForm")
    public String loginForm(){
        return "user/loginForm";
    }
}
