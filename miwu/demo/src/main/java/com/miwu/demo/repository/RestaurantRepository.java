package com.miwu.demo.repository;

// Destination 엔티티
// 엔티티: 데이터베이스 테이블과 매핑되는 클래스
import com.miwu.demo.entity.Restaurant;
// 간단히 DB에 Create/Read/Update/Delete 쿼리 수행을 가능토록 함
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

// 리스트
import java.util.List;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    @Override
    List<Restaurant> findAll(); // 조건없이 테이블의 전체 레코드 조회

    List<Restaurant> findByroadAdress(String roadAdress); // 관광지 광역시/도 를 기반으로 조회

    @Transactional
    @Query(value = "SELECT * FROM Restaurant WHERE restName LIKE CONCAT('%', :searchValue, '%') OR restAdress LIKE CONCAT('%', :searchValue, '%') OR restCategory LIKE CONCAT('%', :searchValue, '%')", nativeQuery = true)
    List<Restaurant> findBySearchValue(@Param("searchValue") String searchValue);

    void deleteAllInBatch(); // 조건없이 테이블의 전체 레코드 삭제
}