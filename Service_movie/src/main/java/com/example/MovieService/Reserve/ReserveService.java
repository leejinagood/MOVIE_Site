package com.example.MovieService.Reserve;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//@Service
//@RequiredArgsConstructor
@Transactional
public class ReserveService {

    // 예약하려는 영화의 id가 존재하는지 검사하는 메소드
//    public Boolean dataCheck(ReserveItemRepository repository, Long id) {
//        ReserveDTO item = repository.findById(id);
//
////        if (item != null) return true;
////        else return false;
//
//        return item == null;
//    }
}
