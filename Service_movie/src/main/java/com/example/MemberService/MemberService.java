//package com.example.MemberService;
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
//    public SiteMember create(String userid, String email, String password) {
//        SiteMember member = new SiteMember();
//        member.setUserid(userid);
//        member.setEmail(email);
//        member.setPassword(password);
//        this.memberRepository.save(member);
//        return member;
//    }
//}