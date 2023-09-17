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
@Table(name = "destination")
@Entity
public class Destination {
    // 기본키 id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // MySQL의 AUTO_INCREMENT를 사용
    private Long id;

    // 여행지명 (not null, varchar(45))
    @Column(name = "NAME", nullable = false, length = 45)
    private String name;

    // 이미지 url (not null, varchar(2000))
    @Column(name = "IMAGE_URL", nullable = false, length = 2000)
    private String image_url;

    // 설명 (not null, varchar(500))
    @Column(name = "Description", nullable = false, length = 500)
    private String description;

    // 생성자
    public Destination(String name, String image_url, String description) {
        this.name = name;
        this.image_url = image_url;
        this.description = description;
    }
}