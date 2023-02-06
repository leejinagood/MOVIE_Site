package com.example.MovieService.Movie;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/movie")
@RequiredArgsConstructor
public class MovieController {

    private final MovieItemRepository itemRepository;

    @ResponseBody
    @GetMapping
    public String items(Model model) {
        List<Movie> items = itemRepository.findAll();
        model.addAttribute("items", items);
//        return "movie/items";
        return "영화 목록";
    }

    @ResponseBody
    @GetMapping("/{movieId}")
    public String item(@PathVariable long movieId, Model model) {
        Movie item = itemRepository.findById(movieId);
        model.addAttribute("item", item);
//        return "redirect:/movie/items/{movieId}";
        return "영화 정보";
    }
}
