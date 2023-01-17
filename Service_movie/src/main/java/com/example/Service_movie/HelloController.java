package com.example.Service_movie;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {


    @GetMapping("mypage")
    public String mypage(){
        return "마이페이지";
    }

    @GetMapping("login")
    public String login(){
        return "로그인";
    }

    @GetMapping("signup")
    public String signup(){
        return "회원가입";
    }

}