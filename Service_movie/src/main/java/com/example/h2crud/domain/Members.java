package com.example.h2crud.domain;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MEMBER")
public class Members implements Serializable {

    private static final long serialVersionUID = 8124227299932339862L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="USERID")
    private long userid;

    @Column(name="PASSWORD")
    private String password;

    @Column(name="EMAIL")
    private int email;
}
