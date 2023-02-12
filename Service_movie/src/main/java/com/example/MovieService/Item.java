package com.example.MovieService;

import lombok.Data;

@Data
public class Item {

    private Long Id;            // 영화 고유 ID (서비스에 등록된 순서, 자동 증가)
    private String itemName;    // 영화 이름 or 영화 ID

    public Item() {
    }

    public Item(String itemName) {
        this.itemName = itemName;
    }
}
