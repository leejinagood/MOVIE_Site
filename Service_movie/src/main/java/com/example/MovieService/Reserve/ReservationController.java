package com.example.MovieService.Reserve;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Controller
@RequestMapping("/reserve")
@RequiredArgsConstructor
public class ReservationController {

    private final ReserveRepository itemRepository;

    @ResponseBody
    @PostMapping("/{movieId}")
    public String reserve(@PathVariable long movieId, @ModelAttribute ReserveDTO reserveDTO) {

        Optional<ReserveDTO> reserveItem = itemRepository.findById(movieId);

        if (reserveItem.isEmpty()) return "예약 실패"; // return "/fail"; // movieId에 해당하는 영화가 없을 때, "/fail" 매핑 호출

//        itemRepository.save(reserveDTO);

//        return "/success";
        return "영화 아이디 : " + movieId + "예약 성공";
    }

    @ResponseBody
    @PostMapping("/success")
    public String success(ReserveDTO reserveDTO) {
        Optional<ReserveDTO> dto = itemRepository.findById(reserveDTO.getId());
        return "영화 아이디 : " + dto.get().getId() + " 예약 성공"; // 임시 리턴값
    }

    @ResponseBody
    @PostMapping("/fail")
    public String fail(ReserveDTO reserveDTO) {
//        return "/reserve/" + reserveDTO.getId();
        return "영화 예약 실패";
    }

    @PostConstruct
    public void init() { // 컨트롤러가 실행되었을 때 처음으로 실행되는 메소드

    }
}
