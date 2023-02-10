package com.example.MemberService;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class SiteMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userid;

    @Column(unique = true)
    private String password;

    @Column(unique = true)
    private String email;
}
