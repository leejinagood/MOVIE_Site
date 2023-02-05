package com.example.MainService;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//@Controller
@RestController // 임시 테스트용 RestController.
@RequestMapping("/member")
public class MainController {

//    @GetMapping("/login")
//    public String login() {
//        return "/login";
//    }

    @GetMapping("/login")
    public String login() {
        return "로그인1";
    }

    @GetMapping
    public String member() {
        return "회원가입2";
    }

    @GetMapping("/mytip")
    public String mytip() {
        return "내정보3";
    }

    @GetMapping("/DaelimBox")
    public String DaelimBox() {
        return "DAELIM BOX";
    }

    @GetMapping("/movie")
    public String movie() {
        return "영화1";
    }

    @GetMapping("/ticketing")
    public String ticketing() {
        return "예매1";
    }
}

