package com.example.MemberService;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<SiteMember, String> {
}