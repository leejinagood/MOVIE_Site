package com.example.MovieService.Reserve;

import java.util.Optional;

public interface ReserveRepository {

//    void save(ReserveDTO dto);

    Optional<ReserveDTO> findById(Long id);

}
