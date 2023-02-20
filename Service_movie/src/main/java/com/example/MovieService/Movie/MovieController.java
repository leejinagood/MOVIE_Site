package com.example.MovieService.Movie;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/movie")
@RequiredArgsConstructor
public class MovieController {

    private final MovieRepository itemRepository;

    @ResponseBody
    @GetMapping
    public String items(Model model) {
        List<MovieDTO> items = itemRepository.findAll();
        model.addAttribute("items", items);
//        return "movie/items";
        return "영화 목록"; // 임시 리턴값
    }

    @ResponseBody
    @GetMapping("/{movieId}")
    public String item(@PathVariable long movieId, Model model) {
        Optional<MovieDTO> item = itemRepository.findById(movieId);
        model.addAttribute("item", item);
//        return "redirect:/movie/items/{movieId}";
        return "영화 정보"; // 임시 리턴값
    }
}
