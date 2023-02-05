package com.example.MovieService;

import lombok.Data;
import java.util.Date;

@Data
public class Movie {

    private Long Id;            // 영화 고유 ID (서비스에 등록된 순서, 자동 증가)
    private String itemName;    // 영화 이름 or 영화 ID
    private float rating;       // 영화 평점 ex) 0.0 ~ 5.0
    private Long total;         // 누적 관객수
    private String genre;       // 영화 장르
    private Date releaseDate;   // 영화 개봉 일자
    private String director;    // 영화 감독
    private String actor;       // 출연자(배우)
    private String info;        // 영화 정보(줄거리 등)

    public Movie() {
    }

    public Movie(String itemName, float rating, Long total, String genre, Date releaseDate, String director, String actor, String info) {
        this.itemName = itemName;
        this.rating = rating;
        this.total = total;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.director = director;
        this.actor = actor;
        this.info = info;
    }
}

