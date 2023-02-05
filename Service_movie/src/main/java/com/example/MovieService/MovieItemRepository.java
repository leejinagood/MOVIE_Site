package com.example.MovieService;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class MovieItemRepository {

    private static final Map<Long, Movie> store = new HashMap<>(); // Movie 클래스 객체를 HashMap 타입으로 지정
    private static long sequence = 0L; // id 자동증가용 변수

    // 영화를 추가할 때 사용하는 메소드
    public Movie save(Movie item) {
        item.setId(++sequence);
        store.put(item.getId(), item);
        return item;
    }

    // 영화 고유 ID로 영화를 찾는 메소드
    public Movie findById(Long id) {
        return store.get(id);
    }

    // 영화 전체를 조회할 때 사용하는 메소드
    public List<Movie> findAll() {
        return new ArrayList<>(store.values());
    }

    // 영화를 수정할 때 사용하는 업데이트 메소드
    public void update(Long itemId, Movie updateItem) {

        Movie findItem = findById(itemId);
        findItem.setItemName(updateItem.getItemName());
        findItem.setRating(updateItem.getRating());
        findItem.setTotal(updateItem.getTotal());
        findItem.setGenre(updateItem.getGenre());
        findItem.setReleaseDate(updateItem.getReleaseDate());
        findItem.setDirector(updateItem.getDirector());
        findItem.setActor(updateItem.getActor());
        findItem.setInfo(updateItem.getInfo());
    }

    // store의 정보를 초기화할 때 사용하는 메소드
    public void clearStore() {
        store.clear();
    }
}
