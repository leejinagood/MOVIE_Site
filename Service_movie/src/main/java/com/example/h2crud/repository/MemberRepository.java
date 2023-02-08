package com.example.h2crud.repository;
import org.springframework.data.repository.CrudRepository;

import com.example.h2crud.domain.Members;

public interface MemberRepository extends CrudRepository<Members, Long> {

}