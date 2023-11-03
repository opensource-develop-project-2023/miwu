// package com.miwu.demo.service;

// import java.io.IOException;
// import java.util.ArrayList;
// import java.util.regex.Matcher;
// import java.util.regex.Pattern;

// import org.jsoup.Connection;
// import org.jsoup.Jsoup;
// import org.jsoup.nodes.Document;
// import org.jsoup.nodes.Element;
// import org.jsoup.select.Elements;

// import org.springframework.stereotype.Service;
// import com.opencsv.exceptions.CsvValidationException;

// /* 1. DB에서 관광지명 가져와서 검색어에 넣는거
// 2. 키값 별로 분류하기
// */

// @Service
// public class RestaurantService {
// public static final String baseUrl =
// "https://m.map.naver.com/search2/search.nhn?&query="; // 임시
// // public static final String basePath = "/Users/rla/Downloads/";

// public ArrayList<ArrayList<String>> restaraunt_list(String restaurant_name)
// throws CsvValidationException, IOException {
// Connection conn = Jsoup.connect(baseUrl + restaurant_name + " 맛집");

// try {
// Document document = conn.get();
// Elements scripts = document.getElementsByTag("script");
// String a = null;

// // System.out.println(document.html());

// for (Element element : scripts) {
// if (element.data().contains("var searchResult")) {
// Pattern pattern = Pattern.compile(".*var searchResult = ([^;]*);");
// Matcher matcher = pattern.matcher(element.data());

// if (matcher.find()) {
// a = matcher.group(1);
// System.out.println(a); // a를 출력하면 받아온거 나옴
// break;
// } else {
// System.err.println("No match found!");
// }
// break;
// }
// }

// } catch (IOException e) {
// e.printStackTrace();
// }
// }
// }
