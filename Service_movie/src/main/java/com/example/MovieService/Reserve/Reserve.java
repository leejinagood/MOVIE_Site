package com.example.MovieService.Reserve;

import com.example.MovieService.Item;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import java.util.Vector;

@EqualsAndHashCode(callSuper = true)
@Data
public class Reserve extends Item {

    private Date time;              // 영화 예약 시간
    private String theater;         // 영화 상영관 숫자 ex) 1관, 2관
    private String type;            // 영화 상영 타입 ex) 자막, 더빙
    private Long price;             // 영화 가격
    private Long totalSeat;         // 영화 상영관 총 좌석 수(상영관 크기)
    private Long leftSeat;          // 영화 상영관 남은 좌석 수
    private Vector<Seat> seat;      // 영화 상영관 좌석 행열 ex) D03, F11, H16
    private int headcount;          // 영화 예약 희망 인원 수

    public Reserve() {
    }

    public Reserve(String itemName, Date time, String theater, String type, Long price, Long totalSeat, Long leftSeat, Vector<Seat> seat, int headcount) {
        super(itemName);
        this.time = time;
        this.theater = theater;
        this.type = type;
        this.price = price;
        this.totalSeat = totalSeat;
        this.leftSeat = leftSeat;
        this.seat = seat;
        this.headcount = headcount;
    }
}
