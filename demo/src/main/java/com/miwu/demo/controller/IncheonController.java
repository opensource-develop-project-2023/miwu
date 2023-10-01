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

// incheon Entity
import com.miwu.demo.entity.Incheon;
// incheon Repository
import com.miwu.demo.repository.IncheonRepository;

@RequiredArgsConstructor // 초기화 되지않은 final 변수에 대해 생성자를 생성
@RestController
public class IncheonController {
    final IncheonRepository incheonRepository;

    @GetMapping("/incheon")
    public List<Incheon> listDestination() throws CsvValidationException, IOException{
        incheonRepository.deleteAllInBatch();
        ArrayList <ArrayList> getCsvInfo =  CsvController.getCsv7();
        for(int i = 0; i < getCsvInfo.size();i++){
            Incheon dst = new Incheon(getCsvInfo.get(i).get(0).toString(), getCsvInfo.get(i).get(1).toString(), getCsvInfo.get(i).get(2).toString(), getCsvInfo.get(i).get(3).toString(), getCsvInfo.get(i).get(4).toString(), getCsvInfo.get(i).get(5).toString(), getCsvInfo.get(i).get(6).toString(), getCsvInfo.get(i).get(7).toString());
            incheonRepository.save(dst);
        }
            return incheonRepository.findAll();
    }
}
