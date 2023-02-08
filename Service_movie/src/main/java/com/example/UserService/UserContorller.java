package com.example.UserService;


import com.example.MemberService.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserContorller {

    private final UserService userService;

    @PostMapping("/login")
    public UserResponseDto login(@RequestBody final UserRequestDto params) {
        UserResponseDto entity = userService.findBy(params);
        return entity;
    }

}
