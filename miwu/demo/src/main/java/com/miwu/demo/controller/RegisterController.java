package com.miwu.demo.controller;

// RequiredArgsConstructor
import lombok.RequiredArgsConstructor;
// RestController
import org.springframework.web.bind.annotation.RestController;
// PostMapping
import org.springframework.web.bind.annotation.PostMapping;
// RequestBody
import org.springframework.web.bind.annotation.RequestBody;
// Img Entity
import com.miwu.demo.entity.UserInfo;
// Restaurant Repository
import com.miwu.demo.repository.UserInfoRepository;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor // 초기화 되지않은 final 변수에 대해 생성자를 생성
@RestController
public class RegisterController {
    final UserInfoRepository userInfoRepository;

    @PostMapping("/register")
    public List<UserInfo> getRegister(@RequestBody String name) {

        List<String> userInfoList = new ArrayList<>();
        String userInfo_temp[] = name.split("\\{|\\}|:|\\s+|,");

        for (int i = 0; i < userInfo_temp.length; i++) {
            userInfo_temp[i] = userInfo_temp[i].replaceAll("\\\"", "");
            if (i != 0 && i % 2 == 0) {
                userInfoList.add(userInfo_temp[i]);
            }

        }

        UserInfo userInfo = new UserInfo(userInfoList.get(0),
                userInfoList.get(1),
                userInfoList.get(2));
        userInfoRepository.save(userInfo);

        return userInfoRepository.findAll();
    }
}