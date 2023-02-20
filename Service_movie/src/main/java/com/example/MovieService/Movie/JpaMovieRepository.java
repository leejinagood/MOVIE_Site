package com.example.MovieService.Movie;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JpaMovieRepository extends JpaRepository<MovieDTO, Long>, MovieRepository {

    @Override
    Optional<MovieDTO> findByName(String name);
}
