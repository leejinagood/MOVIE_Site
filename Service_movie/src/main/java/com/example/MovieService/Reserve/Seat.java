package com.example.MovieService.Reserve;

import lombok.Getter;

@Getter
public class Seat {

    private String alphabet;    // 좌석 행 ex) D, F, H
    private int number;         // 좌석 열 ex) 03, 11, 16

    public Seat() {
    }

    public Seat(String alphabet, int number) {
        this.alphabet = alphabet;
        this.number = number;
    }
}
