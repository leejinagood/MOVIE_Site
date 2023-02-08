package com.example.UserService;


import com.example.h2crud.domain.Members;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PACKAGE)
public class UserResponseDto {
    private Long userid; // PK
    private String email;
    private String passwd;

    public UserResponseDto(Members member_table) {
        this.userid = member_table.getUserid();
        this.email = member_table.getEmail();
        this.passwd = member_table.getPasswd();
    }
}