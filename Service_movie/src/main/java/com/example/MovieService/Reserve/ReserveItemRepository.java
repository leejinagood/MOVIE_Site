package com.example.MovieService.Reserve;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ReserveItemRepository {

    private static final Map<Long, Reserve> store = new HashMap<>(); // Reserve 클래스 객체를 HashMap 타입으로 지정
    private static long sequence = 0L; // id 자동증가용 변수



    // 영화 고유 ID로 영화를 찾는 메소드
    public Reserve findById(Long id) {
        return store.get(id);
    }

    // 영화 전체를 조회할 때 사용하는 메소드
    public List<Reserve> findAll() {
        return new ArrayList<>(store.values());
    }
}
