package com.example.MovieService.Reserve;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/reserve")
@RequiredArgsConstructor
public class ReservationController {

    private final ReserveItemRepository itemRepository;
    private final ReserveService reserveService;

    @ResponseBody
    @GetMapping("/{movieId}")
    public String reserve(@PathVariable long movieId, Model model) {
        ReserveDTO reserveItem = itemRepository.findById(movieId);
//        model.addAttribute("reserve", reserveItem);

        // 다른 클래스에 데이터 검사 메소드 필요
        if (reserveService.isSuccess()) {

        }

//        return "/success";
//        return "/fail";

        return "영화 아이디 : {movieId} 예약 창"; // 임시 리턴값
    }

    @ResponseBody
    @PostMapping("/success")
    public String success(@RequestParam long movieId,
                          @RequestParam String alphabet,
                          @RequestParam int number,
                          Model model) {

        ReserveDTO reserve = new ReserveDTO();

//        model.addAttribute("", reserveItem);
        return "영화 아이디 : {movieId} 예약 성공"; // 임시 리턴값
    }
}
