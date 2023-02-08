package com.example.MovieService.Reserve;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/reserve")
public class ReservationController {

    @ResponseBody
    @GetMapping("/{movieId}")
    public String reserve(@PathVariable long movieId) {
        return "영화 아이디 : {movieId} 예약 창";
    }
}
