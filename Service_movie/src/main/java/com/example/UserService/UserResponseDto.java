//package com.example.UserService;
//
//
//import lombok.AccessLevel;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//
//import java.lang.reflect.Member;
//
//@Getter
//@NoArgsConstructor(access = AccessLevel.PACKAGE)
//public class UserResponseDto {
//    private String userid; // PK
//    private String email;
//    private String password;
//
//    public UserResponseDto(Member member_table) {
//        this.userid = member_table.getUserid();
//        this.email = member_table.getEmail();
//        this.password = member_table.getPassword();
//    }
//}