package com.miwu.demo.controller;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.CdpVersionFinder;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

import org.openqa.selenium.chromium.ChromiumDriver;

/*  1. DB에서 관광지명 가져와서 검색어에 넣는거
*/

public class test2 {

    public static final String baseUrl = "https://m.map.naver.com/search2/search.naver?query=";
    public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
    public static final String WEB_DRIVER_PATH = "/Users/rla/Desktop/chromedriver-win64/chromedriver-win64/chromedriver.exe";

    public static void main(String[] args) {

        String restaurantName = "부산광역시%20맛집"; // Service로 넣을 때 받아오는 걸로 변경

        // 크롬 드라이버 설정
        System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);

        // 크롬 옵션 설정
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");

        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        // 보안 설정추가
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);

        // 네이버 모바일 지도 검색 페이지 접속
        driver.get(baseUrl + restaurantName);

        // 끝까지 스크롤 다운
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        String name; // 음식점 이름
        String adress1;
        String adress_last; // 주소
        String category; // 분류
        String imgUrl; // 이미지

        // 크롤링한 데이터 담아두는 배열
        // List<String> r_name = new ArrayList<>();
        // List<String> r_adress1 = new ArrayList<>();
        // List<String> r_category = new ArrayList<>();
        // List<String> r_imgUrl = new ArrayList<>();
        List<String> r_list = new ArrayList<>();

        // 음식점 50개 크롤링
        for (int i = 1; i <= 50; i++) {
            try {
                name = driver.findElement(By.xpath("//*[@id=\"ct\"]/div[2]/ul/li[" + i + "]/div[1]/a[2]/div/strong"))
                        .getText();
                adress1 = driver.findElement(By.xpath("//*[@id=\"ct\"]/div[2]/ul/li[" + i + "]/div[1]/div[1]/div/a"))
                        .getText();
                adress_last = adress1.substring(5); // '주소보기' 문자열 지움
                category = driver.findElement(By.xpath("//*[@id=\"ct\"]/div[2]/ul/li[" + i + "]/div[1]/a[2]/div/em"))
                        .getText();
                imgUrl = driver.findElement(By.xpath("//*[@id=\"ct\"]/div[2]/ul/li[" + i + "]/div[1]/a[1]/img"))
                        .getAttribute("src");

                // 끝까지 스크롤 다운
                jse.executeScript("window.scrollBy(0, document.body.scrollHeight)");

                // Test용
                // System.out.println("음식점 이름: "+name);
                // System.out.println("주소: "+adress_last);
                // System.out.println("분류: "+category);
                // System.out.println("이미지: "+imgUrl);
                // System.out.println("-------------------------------------");

                // r_name.add(name);
                // r_adress1.add(adress_last);
                // r_category.add(category);
                // r_imgUrl.add(imgUrl);
                r_list.add(name);
                r_list.add(adress_last);
                r_list.add(category);
                r_list.add(imgUrl);

            } catch (Exception e) {
                name = "";
                adress1 = "";
                category = "";
                imgUrl = "";
            }
        }

        // Test용
        // for(int i=0;i<r_name.size(); i++){
        // System.out.println(r_name.get(i));
        // System.out.println(r_adress1.get(i));
        // System.out.println(r_category.get(i));
        // System.out.println(r_imgUrl.get(i));
        // System.out.println("-------------------------------------");
        // }
        for (int i = 0; i < r_list.size(); i = i + 4) {
            System.out.println(r_list.get(i));
            System.out.println(r_list.get(i + 1));
            System.out.println(r_list.get(i + 2));
            System.out.println(r_list.get(i + 3));
            if ((i + 4) == r_list.size()) { // 배열범위를 넘어서는 것을 방지
                break;
            }
        }

        // System.out.println(r_list.get(0));
        // System.out.println(r_list.get(1));
        // System.out.println(r_list.get(2));
        // System.out.println(r_list.get(3));

    }
}
