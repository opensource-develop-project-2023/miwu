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

// GangJu Entity
import com.miwu.demo.entity.GangJu;
// GangJu Repository
import com.miwu.demo.repository.GangJuRepository;

@RequiredArgsConstructor // 초기화 되지않은 final 변수에 대해 생성자를 생성
@RestController
public class GangJuController {
    final GangJuRepository gangJuRepository;

    @GetMapping("/gangju")
    public List<GangJu> listDestination() throws CsvValidationException, IOException{
        gangJuRepository.deleteAllInBatch();
        ArrayList <ArrayList> getCsvInfo =  CsvController.getCsv5();
        for(int i = 0; i < getCsvInfo.size();i++){
            GangJu dst = new GangJu(getCsvInfo.get(i).get(0).toString(), getCsvInfo.get(i).get(1).toString(), getCsvInfo.get(i).get(2).toString(), getCsvInfo.get(i).get(3).toString(), getCsvInfo.get(i).get(4).toString(), getCsvInfo.get(i).get(5).toString(), getCsvInfo.get(i).get(6).toString(), getCsvInfo.get(i).get(7).toString());
            gangJuRepository.save(dst);
        }
            return gangJuRepository.findAll();
    }
}
