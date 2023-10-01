package com.miwu.demo.controller;

// RequiredArgsConstructor
import lombok.RequiredArgsConstructor;
// RestController
import org.springframework.web.bind.annotation.RestController;
// GetMapping
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import com.opencsv.exceptions.CsvValidationException;

// Sejong Entity
import com.miwu.demo.entity.Sejong;
// Sejong Repository
import com.miwu.demo.repository.SejongRepository;

@RequiredArgsConstructor // 초기화 되지않은 final 변수에 대해 생성자를 생성
@RestController
public class SejongController {
    final SejongRepository sejongRepository;

    @GetMapping("/sejong")
    public List<Sejong> listDestination() throws CsvValidationException, IOException{
        sejongRepository.deleteAllInBatch();
        ArrayList <ArrayList> getCsvInfo =  CsvController.getCsv8();
        for(int i = 0; i < getCsvInfo.size();i++){
            Sejong dst = new Sejong(getCsvInfo.get(i).get(0).toString(), getCsvInfo.get(i).get(1).toString(), getCsvInfo.get(i).get(2).toString(), getCsvInfo.get(i).get(3).toString(), getCsvInfo.get(i).get(4).toString(), getCsvInfo.get(i).get(5).toString(), getCsvInfo.get(i).get(6).toString(), getCsvInfo.get(i).get(7).toString());
            sejongRepository.save(dst);
        }
            return sejongRepository.findAll();
    }
}
