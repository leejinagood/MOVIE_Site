package com.example.MovieService.Reserve;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaReserveRepository extends JpaRepository<ReserveDTO, Long>, ReserveRepository {

}
