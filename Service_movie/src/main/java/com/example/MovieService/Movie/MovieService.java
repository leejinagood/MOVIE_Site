package com.example.MovieService.Movie;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
//@Service
@Transactional
public class MovieService {
    public MovieService(MovieRepository movieRepository) {

    }
}
