//package com.example.h2;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Optional;
//
//@RestController
//public class MemberController {
//    private final MemberService memberService;
//
//    @Autowired
//    public MemberController(MemberService memberService) {
//        this.memberService = memberService;
//    }
//
//    @PostMapping("/members/new")
//    public ResponseEntity<?> create(MemberForm memberForm) {
//        Member member = new Member();
//        member.setEmail(memberForm.getEmail());
//
//        memberService.join(member);
//
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
//
//    @GetMapping("/members")
//    public ResponseEntity<?> readAll() {
//        List<Member> members = memberService.findMembers();
//
//        // Response에 넣어준다
//        Map<String, Object> response = new HashMap<>();
//        response.put("members", members);
//
//        return new ResponseEntity<>(response, HttpStatus.OK);
//    }
//
//    @GetMapping("/member/{name}")
//    public ResponseEntity<?> readAll(@PathVariable("email") String name) {
//        Optional<Member> member = memberService.findOneMember(name);
//
//        Map<String, Object> response = new HashMap<>();
//
//        if(!member.isPresent()) { // 그런 이름의 회원이 없으면
//            response.put("message", "No such member");
//            response.put("member", null);
//        } else { // 정상적으로 조회됐으면
//            response.put("message", "Success");
//            response.put("member", member);
//        }
//
//        return new ResponseEntity<>(response, HttpStatus.OK);
//    }
//
//}
