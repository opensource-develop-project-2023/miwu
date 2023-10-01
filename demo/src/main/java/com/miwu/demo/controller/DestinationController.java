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
        
        //busan
        ArrayList <ArrayList> getCsvInfo2 =  CsvController.getCsv2();
        for(int i = 0; i < getCsvInfo2.size();i++){
            Destination dst = new Destination(getCsvInfo2.get(i).get(0).toString(), getCsvInfo2.get(i).get(1).toString(), getCsvInfo2.get(i).get(2).toString(), getCsvInfo2.get(i).get(3).toString(), getCsvInfo2.get(i).get(4).toString(), getCsvInfo2.get(i).get(5).toString(), getCsvInfo2.get(i).get(6).toString(), getCsvInfo2.get(i).get(7).toString());
            destinationRepository.save(dst);
        }

        //Daegu
        ArrayList <ArrayList> getCsvInfo3 =  CsvController.getCsv3();
        for(int i = 0; i < getCsvInfo3.size();i++){
            Destination dst = new Destination(getCsvInfo3.get(i).get(0).toString(), getCsvInfo3.get(i).get(1).toString(), getCsvInfo3.get(i).get(2).toString(), getCsvInfo3.get(i).get(3).toString(), getCsvInfo3.get(i).get(4).toString(), getCsvInfo3.get(i).get(5).toString(), getCsvInfo3.get(i).get(6).toString(), getCsvInfo3.get(i).get(7).toString());
            destinationRepository.save(dst);
        }

        //daejeon
        ArrayList <ArrayList> getCsvInfo4 =  CsvController.getCsv4();
        for(int i = 0; i < getCsvInfo4.size();i++){
            Destination dst = new Destination(getCsvInfo4.get(i).get(0).toString(), getCsvInfo4.get(i).get(1).toString(), getCsvInfo4.get(i).get(2).toString(), getCsvInfo4.get(i).get(3).toString(), getCsvInfo4.get(i).get(4).toString(), getCsvInfo4.get(i).get(5).toString(), getCsvInfo4.get(i).get(6).toString(), getCsvInfo4.get(i).get(7).toString());
            destinationRepository.save(dst);
        }

        //GangJu
        ArrayList <ArrayList> getCsvInfo5 =  CsvController.getCsv5();
        for(int i = 0; i < getCsvInfo5.size();i++){
            Destination dst = new Destination(getCsvInfo5.get(i).get(0).toString(), getCsvInfo5.get(i).get(1).toString(), getCsvInfo5.get(i).get(2).toString(), getCsvInfo5.get(i).get(3).toString(), getCsvInfo5.get(i).get(4).toString(), getCsvInfo5.get(i).get(5).toString(), getCsvInfo5.get(i).get(6).toString(), getCsvInfo5.get(i).get(7).toString());
            destinationRepository.save(dst);
        }

        //Gunggido
        ArrayList <ArrayList> getCsvInfo6 =  CsvController.getCsv6();
        for(int i = 0; i < getCsvInfo6.size();i++){
            Destination dst = new Destination(getCsvInfo6.get(i).get(0).toString(), getCsvInfo6.get(i).get(1).toString(), getCsvInfo6.get(i).get(2).toString(), getCsvInfo6.get(i).get(3).toString(), getCsvInfo6.get(i).get(4).toString(), getCsvInfo6.get(i).get(5).toString(), getCsvInfo6.get(i).get(6).toString(), getCsvInfo6.get(i).get(7).toString());
            destinationRepository.save(dst);
        }

        //incheon
        ArrayList <ArrayList> getCsvInfo7 =  CsvController.getCsv7();
        for(int i = 0; i < getCsvInfo7.size();i++){
            Destination dst = new Destination(getCsvInfo7.get(i).get(0).toString(), getCsvInfo7.get(i).get(1).toString(), getCsvInfo7.get(i).get(2).toString(), getCsvInfo7.get(i).get(3).toString(), getCsvInfo7.get(i).get(4).toString(), getCsvInfo7.get(i).get(5).toString(), getCsvInfo7.get(i).get(6).toString(), getCsvInfo7.get(i).get(7).toString());
            destinationRepository.save(dst);
        }

        //sejong
        ArrayList <ArrayList> getCsvInfo8 =  CsvController.getCsv8();
        for(int i = 0; i < getCsvInfo8.size();i++){
            Destination dst = new Destination(getCsvInfo8.get(i).get(0).toString(), getCsvInfo8.get(i).get(1).toString(), getCsvInfo8.get(i).get(2).toString(), getCsvInfo8.get(i).get(3).toString(), getCsvInfo8.get(i).get(4).toString(), getCsvInfo8.get(i).get(5).toString(), getCsvInfo8.get(i).get(6).toString(), getCsvInfo8.get(i).get(7).toString());
            destinationRepository.save(dst);
        }

        //Seoul
        ArrayList <ArrayList> getCsvInfo9 =  CsvController.getCsv9();
        for(int i = 0; i < getCsvInfo9.size();i++){
            Destination dst = new Destination(getCsvInfo9.get(i).get(0).toString(), getCsvInfo9.get(i).get(1).toString(), getCsvInfo9.get(i).get(2).toString(), getCsvInfo9.get(i).get(3).toString(), getCsvInfo9.get(i).get(4).toString(), getCsvInfo9.get(i).get(5).toString(), getCsvInfo9.get(i).get(6).toString(), getCsvInfo9.get(i).get(7).toString());
            destinationRepository.save(dst);
        }

        //Ulsan
        ArrayList <ArrayList> getCsvInfo10 =  CsvController.getCsv10();
        for(int i = 0; i < getCsvInfo10.size();i++){
            Destination dst = new Destination(getCsvInfo10.get(i).get(0).toString(), getCsvInfo10.get(i).get(1).toString(), getCsvInfo10.get(i).get(2).toString(), getCsvInfo10.get(i).get(3).toString(), getCsvInfo10.get(i).get(4).toString(), getCsvInfo10.get(i).get(5).toString(), getCsvInfo10.get(i).get(6).toString(), getCsvInfo10.get(i).get(7).toString());
            destinationRepository.save(dst);
        }
        
        return destinationRepository.findAll();
    }
}
