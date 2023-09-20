package com.miwu.demo.controller;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class CsvController {
    public static ArrayList <ArrayList> getCsv() throws CsvValidationException, IOException {
        CSVReader csvReader = new CSVReader(new FileReader("tour.csv"));
        String[] line;
        ArrayList <ArrayList> csvInfo = new ArrayList<ArrayList>();
        while ((line = csvReader.readNext()) != null) {
            ArrayList<String> tmp = new ArrayList<>();
            for(int i = 0; i < line.length; i++) {
                tmp.add(line[i]);
                }
            csvInfo.add(tmp);
        }

        
        // 저장된 값 확인을 위한 출력
        for(int i = 0; i < csvInfo.size();i++){
            System.out.println(csvInfo.get(i));
        } 
        
         
        return csvInfo;
    }
}
