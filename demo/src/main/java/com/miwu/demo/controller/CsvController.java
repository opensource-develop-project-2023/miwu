package com.miwu.demo.controller;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.nio.charset.Charset;

public class CsvController {
    public static ArrayList<ArrayList> getCsv() throws CsvValidationException, IOException {
            CSVReader csvReader = new CSVReader(new FileReader("tour.csv", Charset.forName("utf-8")));
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

    public static ArrayList<ArrayList> getCsv2() throws CsvValidationException, IOException {

            //busan
            CSVReader csvReader2 = new CSVReader(new FileReader("busan.csv", Charset.forName("utf-8")));
            String[] line2;
            ArrayList<ArrayList> csvInfo2 = new ArrayList<ArrayList>();
            while ((line2 = csvReader2.readNext()) != null) {
                ArrayList<String> tmp2 = new ArrayList<>();
                for (int i = 0; i < line2.length; i++) {
                    tmp2.add(line2[i]);
                }
                csvInfo2.add(tmp2);
            }

            // 저장된 값 확인을 위한 출력
            for (int i = 0; i < csvInfo2.size(); i++) {
                System.out.println(csvInfo2.get(i));
            }
            return csvInfo2;
        }

    public static ArrayList<ArrayList> getCsv3() throws CsvValidationException, IOException {

            //Daegu
            CSVReader csvReader3 = new CSVReader(new FileReader("Daegu.csv", Charset.forName("utf-8")));
            String[] line3;
            ArrayList<ArrayList> csvInfo3 = new ArrayList<ArrayList>();
            while ((line3 = csvReader3.readNext()) != null) {
                ArrayList<String> tmp3 = new ArrayList<>();
                for (int i = 0; i < line3.length; i++) {
                    tmp3.add(line3[i]);
                }
                csvInfo3.add(tmp3);
            }

            // 저장된 값 확인을 위한 출력
            for (int i = 0; i < csvInfo3.size(); i++) {
                System.out.println(csvInfo3.get(i));
            }

            return csvInfo3;
        }
    public static ArrayList<ArrayList> getCsv4() throws CsvValidationException, IOException {
            
            //daejeon
            CSVReader csvReader4 = new CSVReader(new FileReader("daejeon.csv", Charset.forName("utf-8")));
            String[] line4;
            ArrayList<ArrayList> csvInfo4 = new ArrayList<ArrayList>();
            while ((line4 = csvReader4.readNext()) != null) {
                ArrayList<String> tmp4 = new ArrayList<>();
                for (int i = 0; i < line4.length; i++) {
                    tmp4.add(line4[i]);
                }
                csvInfo4.add(tmp4);
            }

            // 저장된 값 확인을 위한 출력
            for (int i = 0; i < csvInfo4.size(); i++) {
                System.out.println(csvInfo4.get(i));
            }

            return csvInfo4;
        }
    public static ArrayList<ArrayList> getCsv5() throws CsvValidationException, IOException {
            
            //GangJu
            CSVReader csvReader5 = new CSVReader(new FileReader("GangJu.csv", Charset.forName("utf-8")));
            String[] line5;
            ArrayList<ArrayList> csvInfo5 = new ArrayList<ArrayList>();
            while ((line5 = csvReader5.readNext()) != null) {
                ArrayList<String> tmp5 = new ArrayList<>();
                for (int i = 0; i < line5.length; i++) {
                    tmp5.add(line5[i]);
                }
                csvInfo5.add(tmp5);
            }

            // 저장된 값 확인을 위한 출력
            for (int i = 0; i < csvInfo5.size(); i++) {
                System.out.println(csvInfo5.get(i));
            }

            return csvInfo5;
        }
    public static ArrayList<ArrayList> getCsv6() throws CsvValidationException, IOException {

            //Gunggido
            CSVReader csvReader6 = new CSVReader(new FileReader("Gunggido.csv", Charset.forName("utf-8")));
            String[] line6;
            ArrayList<ArrayList> csvInfo6 = new ArrayList<ArrayList>();
            while ((line6 = csvReader6.readNext()) != null) {
                ArrayList<String> tmp6 = new ArrayList<>();
                for (int i = 0; i < line6.length; i++) {
                    tmp6.add(line6[i]);
                }
                csvInfo6.add(tmp6);
            }

            // 저장된 값 확인을 위한 출력
            for (int i = 0; i < csvInfo6.size(); i++) {
                System.out.println(csvInfo6.get(i));
            }

            return csvInfo6;
        }
    public static ArrayList<ArrayList> getCsv7() throws CsvValidationException, IOException {

            //incheon
            CSVReader csvReader7 = new CSVReader(new FileReader("incheon.csv", Charset.forName("utf-8")));
            String[] line7;
            ArrayList<ArrayList> csvInfo7 = new ArrayList<ArrayList>();
            while ((line7 = csvReader7.readNext()) != null) {
                ArrayList<String> tmp7 = new ArrayList<>();
                for (int i = 0; i < line7.length; i++) {
                    tmp7.add(line7[i]);
                }
                csvInfo7.add(tmp7);
            }

            // 저장된 값 확인을 위한 출력
            for (int i = 0; i < csvInfo7.size(); i++) {
                System.out.println(csvInfo7.get(i));
            }

            return csvInfo7;
    }
    public static ArrayList<ArrayList> getCsv8() throws CsvValidationException, IOException {

            //sejong
            CSVReader csvReader8 = new CSVReader(new FileReader("sejong.csv", Charset.forName("utf-8")));
            String[] line8;
            ArrayList<ArrayList> csvInfo8 = new ArrayList<ArrayList>();
            while ((line8 = csvReader8.readNext()) != null) {
                ArrayList<String> tmp8 = new ArrayList<>();
                for (int i = 0; i < line8.length; i++) {
                    tmp8.add(line8[i]);
                }
                csvInfo8.add(tmp8);
            }

            // 저장된 값 확인을 위한 출력
            for (int i = 0; i < csvInfo8.size(); i++) {
                System.out.println(csvInfo8.get(i));
            }

            return csvInfo8;
        }
    public static ArrayList<ArrayList> getCsv9() throws CsvValidationException, IOException {

            //Seoul
            CSVReader csvReader9 = new CSVReader(new FileReader("Seoul.csv", Charset.forName("utf-8")));
            String[] line9;
            ArrayList<ArrayList> csvInfo9 = new ArrayList<ArrayList>();
            while ((line9 = csvReader9.readNext()) != null) {
                ArrayList<String> tmp9 = new ArrayList<>();
                for (int i = 0; i < line9.length; i++) {
                    tmp9.add(line9[i]);
                }
                csvInfo9.add(tmp9);
            }

            // 저장된 값 확인을 위한 출력
            for (int i = 0; i < csvInfo9.size(); i++) {
                System.out.println(csvInfo9.get(i));
            }

            return csvInfo9;
        }

    public static ArrayList<ArrayList> getCsv10() throws CsvValidationException, IOException {

            //Ulsan
            CSVReader csvReader10 = new CSVReader(new FileReader("Ulsan.csv", Charset.forName("utf-8")));
            String[] line10;
            ArrayList<ArrayList> csvInfo10 = new ArrayList<ArrayList>();
            while ((line10 = csvReader10.readNext()) != null) {
                ArrayList<String> tmp10 = new ArrayList<>();
                for (int i = 0; i < line10.length; i++) {
                    tmp10.add(line10[i]);
                }
                csvInfo10.add(tmp10);
            }

            // 저장된 값 확인을 위한 출력
            for (int i = 0; i < csvInfo10.size(); i++) {
                System.out.println(csvInfo10.get(i));
            }

            return csvInfo10;
    }
}
