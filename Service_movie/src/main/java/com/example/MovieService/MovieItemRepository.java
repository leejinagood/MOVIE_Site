package com.example.MovieService;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class MovieItemRepository {

    private static final Map<Long, Movie> store = new HashMap<>();
    private static long sequence = 0L;

    public Movie save(Movie item) {
        item.setId(++sequence);
        store.put(item.getId(), item);
        return item;
    }

    public Movie findById(Long id) {
        return store.get(id);
    }

    public List<Movie> findAll() {
        return new ArrayList<>(store.values());
    }

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

    public void clearStore() {
        store.clear();
    }
}
