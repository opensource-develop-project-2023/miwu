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

// Gunggido Entity
import com.miwu.demo.entity.Gunggido;
// Gunggido Repository
import com.miwu.demo.repository.GunggidoRepository;

@RequiredArgsConstructor // 초기화 되지않은 final 변수에 대해 생성자를 생성
@RestController
public class GunggidoController {
    final GunggidoRepository gunggidoRepository;

    @GetMapping("/gunggido")
    public List<Gunggido> listDestination() throws CsvValidationException, IOException{
        gunggidoRepository.deleteAllInBatch();
        ArrayList <ArrayList> getCsvInfo =  CsvController.getCsv6();
        for(int i = 0; i < getCsvInfo.size();i++){
            Gunggido dst = new Gunggido(getCsvInfo.get(i).get(0).toString(), getCsvInfo.get(i).get(1).toString(), getCsvInfo.get(i).get(2).toString(), getCsvInfo.get(i).get(3).toString(), getCsvInfo.get(i).get(4).toString(), getCsvInfo.get(i).get(5).toString(), getCsvInfo.get(i).get(6).toString(), getCsvInfo.get(i).get(7).toString());
            gunggidoRepository.save(dst);
        }
            return gunggidoRepository.findAll();
    }
}
