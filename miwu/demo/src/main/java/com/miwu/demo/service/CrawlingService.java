package com.miwu.demo.service;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import org.springframework.stereotype.Service;

@Service
public class CrawlingService {
    public List<String> getImg(String imgName) throws IOException {
        String baseUrl = "https://www.google.com/search?q=" + imgName
                + "&sca_esv=570303733&rlz=1C5CHFA_enKR970KR970&tbm=isch&source=lnms&sa=X&ved=2ahUKEwj_qqPO8tmBAxUhq1YBHaI2CC0Q_AUoAXoECAEQAw&biw=1174&bih=435&dpr=2";
        Document rawData = Jsoup.connect(baseUrl).get();
        Elements imgs = rawData.select("img[class=rg_i Q4LuWd]");
        List<String> imageUrls = new ArrayList<>();

        if (imgs.size() >= 5) {
            int page = 0;
            for (Element img : imgs) {
                String url = img.attr("abs:data-src");
                if (url != "" && url != null) {
                    page++;
                    imageUrls.add(url);
                }
                if (page == 5)
                    break;
            }
            System.out.println(imgName + " 이미지 검색 완료");
        }

        return imageUrls;
    }
}
