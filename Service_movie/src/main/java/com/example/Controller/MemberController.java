//package com.example.Controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import java.lang.reflect.Member;
//import java.util.List;
//
//@Controller
//public class MemberController {
//
//    private MemberService memberService;
//
//    @Autowired
//    public MemberController(MemberService memberService){
//        this.memberService = memberService;
//    }
//
//    @GetMapping("/members/new")
//    public String createForm(){
//        return "members/createMemberForm";
//    }
//
//    @PostMapping("/members/new")
//    public String create(MemberForm form){
//        // post로 넘어온 input 데이터(name)는 매개변수로 입력한 MemberForm에 있는 name에 자동으로 setName이 됨
//        Member member = new Member();
//        member.setName(form.getName());
//
//        memberService.join(member);
//
//        return "redirect:/";
//    }
//
//}