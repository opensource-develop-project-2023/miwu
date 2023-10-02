package com.miwu.demo.controller;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.nio.charset.Charset;

public class CsvController {
    public static ArrayList<ArrayList> getCsv(String csv_name) throws CsvValidationException, IOException {
            CSVReader csvReader = new CSVReader(new FileReader(csv_name, Charset.forName("utf-8")));
            String[] line;
            ArrayList<ArrayList> csvInfo = new ArrayList<ArrayList>();
            while ((line = csvReader.readNext()) != null) {
                ArrayList<String> tmp = new ArrayList<>();
                for (int i = 0; i < line.length; i++) {
                    tmp.add(line[i]);
                }
                csvInfo.add(tmp);
            }

            // 저장된 값 확인을 위한 출력
            for (int i = 0; i < csvInfo.size(); i++) {
                System.out.println(csvInfo.get(i));
            }
            return csvInfo;
        }

    //food_전국
    public static ArrayList<ArrayList> getCsv_food() throws CsvValidationException, IOException {

            CSVReader csvReader_food = new CSVReader(new FileReader("tour_food.csv", Charset.forName("utf-8")));
            String[] line_food;
            ArrayList<ArrayList> csvInfo_food = new ArrayList<ArrayList>();
            while ((line_food = csvReader_food.readNext()) != null) {
                ArrayList<String> tmp_food = new ArrayList<>();
                for (int i = 0; i < line_food.length; i++) {
                    tmp_food.add(line_food[i]);
                }
                csvInfo_food.add(tmp_food);
            }

            // 저장된 값 확인을 위한 출력
            for (int i = 0; i < csvInfo_food.size(); i++) {
                System.out.println(csvInfo_food.get(i));
            }
            return csvInfo_food;
        }
}
