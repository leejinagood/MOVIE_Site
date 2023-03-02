package com.example.MovieService.Movie;

import com.example.MovieService.ItemDTO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

@Getter @Setter @Entity
public class MovieDTO extends ItemDTO {

    @Column(name = "rating")
    private float rating;       // 영화 평점 ex) 0.0 ~ 5.0

    @Column(name = "total")
    private Long total;         // 누적 관객수

    @Column(name = "genre")
    private String genre;       // 영화 장르

    @Column(name = "releaseDate")
    private Date releaseDate;   // 영화 개봉 일자

    @Column(name = "director")
    private String director;    // 영화 감독

    @Column(name = "actor")
    private String actor;       // 출연자(배우)

    @Column(name = "info")
    private String info;        // 영화 정보(줄거리 등)

    public MovieDTO() {
    }

    public MovieDTO(float rating, Long total, String genre, Date releaseDate, String director, String actor, String info) {
        this.rating = rating;
        this.total = total;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.director = director;
        this.actor = actor;
        this.info = info;
    }
}

