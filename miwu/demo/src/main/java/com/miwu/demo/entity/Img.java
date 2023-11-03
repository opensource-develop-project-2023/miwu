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
@Table(name = "img")
@Entity
public class Img {
    // 기본키 id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // MySQL의 AUTO_INCREMENT를 사용
    private Long id;

    // 이미지 url
    @Column(name = "url1", nullable = false, length = 2083)
    private String url1;

    // 이미지 url
    @Column(name = "url2", nullable = false, length = 2083)
    private String url2;
    // 이미지 url
    @Column(name = "url3", nullable = false, length = 2083)
    private String url3;
    // 이미지 url
    @Column(name = "url4", nullable = false, length = 2083)
    private String url4;

    @Column(name = "url5", nullable = false, length = 2083)
    private String url5;

    // 관광지명
    @Column(name = "dest_name", nullable = false, length = 45)
    private String dest_name;

    // 생성자
    public Img(String dest_name, String url1, String url2, String url3, String url4, String url5) {
        this.dest_name = dest_name;
        this.url1 = url1;
        this.url2 = url2;
        this.url3 = url3;
        this.url4 = url4;
        this.url5 = url5;
    }
}