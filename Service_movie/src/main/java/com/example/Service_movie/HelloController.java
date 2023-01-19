package com.example.Service_movie;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
        public static void main(String[] args) {
            SpringApplication.run(com.example.Service_movie.ServiceMovieApplication.class, args);
        }
    @GetMapping("/")
    public String index() {
        return "index.html";
    }

    }
