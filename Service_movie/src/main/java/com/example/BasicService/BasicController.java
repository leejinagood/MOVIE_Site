package com.example.BasicService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BasicController {

    @GetMapping("/index")
    public String index() {
//        return "index.html"; // 현재 resource 디렉토리에 index.html 파일이 없음.
        return "index.html";
    }


}
