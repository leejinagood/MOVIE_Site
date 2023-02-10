//package com.example.UserService;
//
//import com.example.MemberService.MemberRepository;
//import com.example.MemberService.SiteMember;
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.lang.reflect.Member;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//@RequiredArgsConstructor
//@Service
//public class UserSecurityService implements UserDetailsService {
//
//    private final MemberRepository memberRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String userid) throws UsernameNotFoundException {
//        Optional<SiteMember> _siteMember = this.memberRepository.findByusername(userid);
//        if (_siteMember.isEmpty()) {
//            throw new UsernameNotFoundException("사용자를 찾을수 없습니다.");
//        }
//        SiteMember siteMember = _siteMember.get();
//        List<GrantedAuthority> authorities = new ArrayList<>();
//        if ("admin".equals(userid)) {
//            authorities.add(new SimpleGrantedAuthority(UserRole.ADMIN.getValue()));
//        } else {
//            authorities.add(new SimpleGrantedAuthority(UserRole.USER.getValue()));
//        }
//        return new User(siteMember.getEmail(), siteMember.getPassword(), authorities);
//    }
//}
