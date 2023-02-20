package com.example.MovieService.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieRepository {

//    void save(MovieDTO dto);

    Optional<MovieDTO> findById(Long id);

    Optional<MovieDTO> findByName(String name);

    List<MovieDTO> findAll();

}
