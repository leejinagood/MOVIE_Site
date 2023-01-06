package com.example.Service_movie;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HelloController {

    @GetMapping("hello")
    public List<String> hello() {
        return Arrays.asList("안녕하세요", "안녕안녕안녕");
    }
}