package com.miwu.demo.controller;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingController {

  public static final String baseUrl = "https://www.google.com/search?q=%EB%A7%A5%EC%A3%BC+%EC%9D%B4%EB%AF%B8%EC%A7%80&tbm=isch&ved=2ahUKEwiu_o621NeBAxXZBYgKHcP4B7YQ2-cCegQIABAA&oq=%EB%A7%A5%EC%A3%BC+%EC%9D%B4%EB%AF%B8%EC%A7%80&gs_lcp=CgNpbWcQAzIFCAAQgAQyBggAEAgQHjIGCAAQBRAeOggIABCABBCxA1CiBliILWCzLmgBcAB4AoAB3wGIAbMNkgEGMS4xMi4xmAEAoAEBqgELZ3dzLXdpei1pbWewAQDAAQE&sclient=img&ei=Gt8aZa6JBdmLoATD8Z-wCw&bih=592&biw=1175&rlz=1C5CHFA_enKR970KR970";
  public static final String basePath = "/Users/byul/Downloads/";

  public static void main(String[] args) throws IOException {
    Document rawData = Jsoup.connect(baseUrl).get();
    Elements imgs = rawData.select("img[class=rg_i Q4LuWd]");
    List<String> imageUrls = new ArrayList<>();

    int page = 0;

    for(Element img : imgs) {
      String url = img.attr("abs:data-src");
      if (url != "") {
        imageUrls.add(url);
         URL imgUrl = new URL(url);
        BufferedImage jpg = ImageIO.read(imgUrl);
        File file = new File(basePath+page+".jpg");
        ImageIO.write(jpg, "jpg", file);
        page+=1;
      }
      if(page > 20) break;  // 이미지 저장 개수 조정
    }
    System.out.println(imageUrls); // 이미지 URL들.
  }
}
    
