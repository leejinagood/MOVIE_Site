package com.example.MovieService.Movie;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public class MovieService {
    public MovieService(MovieRepository movieRepository) {

    }
}
