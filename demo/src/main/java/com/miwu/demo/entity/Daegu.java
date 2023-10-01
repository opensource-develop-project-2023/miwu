package com.miwu.demo.entity;

// lombok
import lombok.ToString; // toString() 생략
import lombok.Getter; // get 메소드 생성
import lombok.Builder; // builder 패턴 자동 생성
import lombok.AllArgsConstructor; // 모든 필드 값을 파라미터로 받는 생성자(id 제외)를 만듦
import lombok.NoArgsConstructor; // 파라미터가 없는 기본 생성자(id)를 생성
// jakarta
import jakarta.persistence.Table; // 테이블 지정
import jakarta.persistence.Entity; // 데이터베이스 테이블과 매핑되는 클래스
import jakarta.persistence.Id; // 엔터티의 기본 키를 지정
import jakarta.persistence.GeneratedValue; // 기본 키 값에 대한 생성자 제공
import jakarta.persistence.GenerationType; // 기본 키 값에 대한 생성 타입
import jakarta.persistence.Column; // 열 지정

@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Daegu")
@Entity
public class Daegu {
    // 기본키 id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // MySQL의 AUTO_INCREMENT를 사용
    private Long id;

    //순위
    @Column(name = "rank_number", nullable = false, length = 100)
    private String rank_number;

    //광역시/도
    @Column(name = "ADRESS1", nullable = false, length = 45)
    private String adress1;

    //시/군/구
    @Column(name = "ADRESS2", nullable = false, length = 45)
    private String adress2;

    // 관광지명 (not null, varchar(45))
    @Column(name = "dest_name", nullable = false, length = 45)
    private String dest_name;

    //도로명주소
    @Column(name = "ROADADRESS", nullable = false, length = 200)
    private String road_adress;

    //중분류 카테고리
    @Column(name = "M_CATEGORY", nullable = false, length = 200)
    private String m_category;

    //소분류 카테고리
    @Column(name = "S_CATEGORY", nullable = false, length = 200)
    private String s_category;

    //검색건수
    @Column(name = "SEARCH_NUMBER", nullable = false, length = 200)
    private String search_number;

    // 생성자
    public Daegu(String rank_number, String adress1, String adress2, 
    String dest_name, String road_adress, String m_category, String s_category, String search_number)
    {
        this.rank_number=rank_number;
        this.adress1=adress1;
        this.adress2=adress2;
        this.dest_name=dest_name;
        this.road_adress=road_adress;
        this.m_category=m_category;
        this.s_category=s_category;
        this.search_number=search_number;
    }
}



