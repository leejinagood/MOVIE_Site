package movieservice.service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {

//    @GetMapping("/login")
//    public String login() {
//        return "/login";
//    }

    @GetMapping("/index")
    public String index() {
        return "index.html";
    }

    @GetMapping("/user/login")
    public String login(){
        return "로그인1";
    }

    @GetMapping("/user/member")
    public String member(){
        return "회원가입2";
    }

    @GetMapping("/user/mytip")
    public String mytip(){
        return "내정보3";
    }

    @GetMapping("/user/DaelimBox")
    public String DaelimBox(){
        return "DAELIM BOX";
    }

    @GetMapping("/user/movie")
    public String movie(){
        return "영화1";
    }

    @GetMapping("/user/ticketing")
    public String ticketing(){
        return "예매1";
    }
}
