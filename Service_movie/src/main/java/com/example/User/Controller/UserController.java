package com.example.User.Controller;

import com.example.User.Service.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping ("/api/users")
    public User user () {
        User user = new User("로그인^^");
        return user;
    }
}