package com.example.MovieService;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter @Entity
public class ItemDTO {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;            // 영화 고유 ID (서비스에 등록된 순서, 자동 증가)

    @Column(name = "name")
    private String name;        // 영화 이름 or 영화 ID

    public ItemDTO() {
    }

    public ItemDTO(String name) {
        this.name = name;
    }
}
