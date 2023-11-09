package com.miwu.demo.controller;

// RequiredArgsConstructor
import lombok.RequiredArgsConstructor;
// RestController
import org.springframework.web.bind.annotation.RestController;
// PostMapping
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor // 초기화 되지않은 final 변수에 대해 생성자를 생성
@RestController
public class RegisterController {
    @PostMapping("/register")
    public int getRegister() {
        return 3;
    }
}
