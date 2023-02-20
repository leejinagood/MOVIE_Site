package com.example;

import com.example.MovieService.Movie.MovieRepository;
import com.example.MovieService.Movie.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    private final MovieRepository movieRepository;

    @Autowired
    public Config(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Bean
    public MovieService movieService() {
        return new MovieService(movieRepository);
    }

//    @PersistenceContext
//    private EntityManager em;

//    @Autowired
//    public Config(EntityManager em) {
//        this.em = em;
//    }

//    @Bean
//    public MovieRepository movieRepository() {
//        return new JpaMovieRepository(em);
//
//    }
}
