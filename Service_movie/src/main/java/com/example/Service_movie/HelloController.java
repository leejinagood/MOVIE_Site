package com.example.Service_movie;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
        public static void main(String[] args) {
            SpringApplication.run(com.example.Service_movie.ServiceMovieApplication.class, args);
        }
    @GetMapping("/index")
    public String index() {
        return "index.html";
    }

    @GetMapping("/user/login")
    public String login(){
        return "로그인";
    }
    @GetMapping("/user/member")
    public String member(){
        return "회원가입";
    }
    @GetMapping("/user/mytip")
    public String mytip(){
        return "내정보";
    }
    @GetMapping("/user/DaelimBox")
    public String DaelimBox(){
        return "DAELIM BOX";
    }
    @GetMapping("/user/movie")
    public String movie(){
        return "영화";
    }
    @GetMapping("/user/ticketing")
    public String ticketing(){
        return "예매";
    }
    }
