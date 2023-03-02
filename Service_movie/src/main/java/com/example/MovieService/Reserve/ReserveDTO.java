package com.example.MovieService.Reserve;

import com.example.MovieService.ItemDTO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;
import java.util.Vector;

@Getter @Setter @Entity
public class ReserveDTO extends ItemDTO {

    @Column(name = "time")
    private Date time;              // 영화 예약 시간

    @Column(name = "theater")
    private String theater;         // 영화 상영관 숫자 ex) 1관, 2관

    @Column(name = "type")
    private String type;            // 영화 상영 타입 ex) 자막, 더빙

    @Column(name = "price")
    private Long price;             // 영화 가격

    @Column(name = "totalSeat")
    private Long totalSeat;         // 영화 상영관 총 좌석 수(상영관 크기)

    @Column(name = "leftSeat")
    private Long leftSeat;          // 영화 상영관 남은 좌석 수

    @Column(name = "seatHorizontal")
    private String seatHorizontal;  // 영화 상영관 좌석 열 ex) D, F, H

    @Column(name = "seatVertical")
    private String seatVertical;    // 영화 상영관 좌석 행 ex) 03, 11, 16

    @Column(name = "headcount")
    private int headcount;          // 영화 예약 희망 인원 수

    public ReserveDTO() {
    }

    public ReserveDTO(Date time, String theater, String type, Long price, Long totalSeat, Long leftSeat, String seatHorizontal, String seatVertical, int headcount) {
        this.time = time;
        this.theater = theater;
        this.type = type;
        this.price = price;
        this.totalSeat = totalSeat;
        this.leftSeat = leftSeat;
        this.seatHorizontal = seatHorizontal;
        this.seatVertical = seatVertical;
        this.headcount = headcount;
    }

}
