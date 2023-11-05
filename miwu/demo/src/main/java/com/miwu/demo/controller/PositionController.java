package com.miwu.demo.controller;

// RequiredArgsConstructor
import lombok.RequiredArgsConstructor;
// RestController
import org.springframework.web.bind.annotation.RestController;

// GetMapping
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.io.IOException;

@RequiredArgsConstructor // 초기화 되지않은 final 변수에 대해 생성자를 생성
@RestController
public class PositionController {

    @GetMapping("/position")
    public ArrayList<Double> getPosition() throws IOException {
        ArrayList<Double> positionList = new ArrayList<>();

        positionList.add(36.629471);
        positionList.add(127.464317);
        return positionList;
    }
}
