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

// 여행지 테이블
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "restaurant")
@Entity
public class Restaurant {
    // 기본키 id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // MySQL의 AUTO_INCREMENT를 사용
    private Long id;

    // 맛집 이름
    @Column(name = "name", nullable = false, length = 2083)
    private String name;

    // 맛집 주소
    @Column(name = "adress", nullable = false, length = 2083)
    private String adress;

    // 카테고리
    @Column(name = "category", nullable = false, length = 2083)
    private String category;

    // 맛집 이미지 url
    @Column(name = "r_imgUrl", nullable = false, length = 45)
    private String r_imgUrl;

    // 생성자
    public Restaurant(String name, String adress, String category, String r_imgUrl) {
        this.name = name;
        this.adress = adress;
        this.category = category;
        this.r_imgUrl = r_imgUrl;
    }
}
