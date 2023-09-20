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

// Destination Entity
import com.miwu.demo.entity.Destination;
// Destination Repository
import com.miwu.demo.repository.DestinationRepository;

@RequiredArgsConstructor // 초기화 되지않은 final 변수에 대해 생성자를 생성
@RestController
public class DestinationController {
    final DestinationRepository destinationRepository;

    @GetMapping("/destination")
    public List<Destination> listDestination() throws CsvValidationException, IOException{
        destinationRepository.deleteAllInBatch();
        ArrayList <ArrayList> getCsvInfo =  CsvController.getCsv();
        for(int i = 0; i < getCsvInfo.size();i++){
            Destination dst = new Destination(getCsvInfo.get(i).get(0).toString(), getCsvInfo.get(i).get(1).toString(), getCsvInfo.get(i).get(2).toString(), getCsvInfo.get(i).get(3).toString(), getCsvInfo.get(i).get(4).toString(), getCsvInfo.get(i).get(5).toString(), getCsvInfo.get(i).get(6).toString(), getCsvInfo.get(i).get(7).toString());
            destinationRepository.save(dst);
        } 
        return destinationRepository.findAll();
    }
}
