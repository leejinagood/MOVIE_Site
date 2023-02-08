package com.example.UserService;


import com.example.h2crud.domain.Members;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Members, Long> {

    UserResponseDto findByEmailAndPasswd(final String email, final String passwd);

}
