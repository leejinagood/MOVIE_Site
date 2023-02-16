package com.example.MovieService.Reserve;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ReserveItemRepository {

    private static final Map<Long, ReserveDTO> store = new HashMap<>(); // Reserve 클래스 객체를 HashMap 타입으로 지정
    private static long sequence = 0L;


    public void save(ReserveDTO reserveDTO) {
        reserveDTO.setId(++sequence);
        store.put(reserveDTO.getId(), reserveDTO);
    }

    // 영화 고유 ID로 영화를 찾는 메소드
    public ReserveDTO findById(Long id) {
        return store.get(id);
    }
}
