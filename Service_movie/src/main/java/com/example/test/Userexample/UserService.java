//package com.example.UserService;
//
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//@Service
//@RequiredArgsConstructor
//public class UserService {
//
//    //final 붙여야지 생성자 만들어줌
//    private final UserRepository memberRepository;
//
//    public UserResponseDto findBy(final UserRequestDto params){
//        UserResponseDto entity = memberRepository.findByEmailAndPasswd(params.getEmail(), params.getPassword(), params.getUserid());
//        return entity;
//    }
//
//}