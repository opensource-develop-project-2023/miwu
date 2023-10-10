package com.miwu.demo.controller;

// RequiredArgsConstructor
import lombok.RequiredArgsConstructor;
// RestController
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
// GetMapping
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import com.opencsv.exceptions.CsvValidationException;

// CsvService 
import com.miwu.demo.service.CsvService;

// Destination Entity
import com.miwu.demo.entity.Destination;
// Img Entity
import com.miwu.demo.entity.Img;

// Destination Repository
import com.miwu.demo.repository.DestinationRepository;
import com.miwu.demo.repository.ImgRepository;

@RequiredArgsConstructor // 초기화 되지않은 final 변수에 대해 생성자를 생성
@RestController
public class DestinationController {
    final DestinationRepository destinationRepository;
    final ImgRepository imgRepository;
    @Autowired
    private CsvService csvService;

    @GetMapping("/destination/{location}")
    public List<Destination> listDestination(@PathVariable("location") String location)
            throws CsvValidationException, IOException {
        destinationRepository.deleteAllInBatch();

        String csvPath = "miwu/demo/csv/";
        String csvname = csvPath + location + ".csv";

        ArrayList<ArrayList<String>> getCsvInfo = csvService.getCsv(csvname);

        for (int i = 0; i < getCsvInfo.size(); i++) {
            Destination dst = new Destination(
                    getCsvInfo.get(i).get(0).toString(),
                    getCsvInfo.get(i).get(1).toString(),
                    getCsvInfo.get(i).get(2).toString(),
                    getCsvInfo.get(i).get(3).toString(),
                    getCsvInfo.get(i).get(4).toString(),
                    getCsvInfo.get(i).get(5).toString(),
                    getCsvInfo.get(i).get(6).toString(),
                    getCsvInfo.get(i).get(7).toString());
            Img img = new Img(getCsvInfo.get(i).get(3).toString(), "undeined");
            dst.addImg(img);
            dst.addImg(img);
            destinationRepository.save(dst);
        }
        return destinationRepository.findAll();
    }
}
