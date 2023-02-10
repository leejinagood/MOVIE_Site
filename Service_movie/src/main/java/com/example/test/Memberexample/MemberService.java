//package com.example.MemberService;
//
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//@RequiredArgsConstructor
//@Service
//public class MemberService {
//
//    private final MemberRepository memberRepository;
//
//    public Member create(String username, String email, String password) {
//        Member user = new Member();
//        user.setUserid(username);
//        user.setEmail(email);
//        user.setPassword(password);
//        this.memberRepository.save(user);
//        return user;
//    }
//}
