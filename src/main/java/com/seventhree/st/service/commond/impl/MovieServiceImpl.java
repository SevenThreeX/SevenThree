package com.seventhree.st.service.commond.impl;

import com.alibaba.fastjson.JSONArray;
import com.seventhree.st.model.commond.Movie;
import com.seventhree.st.service.commond.MovieService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MovieServiceImpl implements MovieService {
    @Override
    public JSONArray getMovie(String html) {
        JSONArray jsonArray = new JSONArray();
        Document doc = Jsoup.parse(html);

        //第二步，根据我们需要得到的标签，选择提取相应标签的内容
        Elements elements = doc.select("span[class=xing_vb4]");

        for( Element element : elements ){
            String title = element.text();
            Movie movie = new Movie();
            movie.setName(title);
            movie.setUrl(element.select("a").attr("href"));
            jsonArray.add(movie);
        }
        return jsonArray;
    }

    @Override
    public JSONArray getMovieDetails(String html) {
        JSONArray jsonArray = new JSONArray();
        Document doc = Jsoup.parse(html);

        //第二步，根据我们需要得到的标签，选择提取相应标签的内容
//        Elements elements = doc.select("input[name=copy_sel]");
        Elements div = doc.select("div[class=vodplayinfo]");

        for( Element element : div ){
            Document divs = Jsoup.parse(element.toString());
            Elements ul = divs.select("ul");
            for (Element element1 : ul){
                Document uls = Jsoup.parse(element1.toString());
                Elements li = uls.select("li");
                for (Element element2:li){
                    Document lis = Jsoup.parse(element2.toString());
                    String lina = lis.select("li").text();
                    String name = lina.substring(0, lina.indexOf("$"));
                    String url = lis.select("input[name=copy_sel]").attr("value");
                    Movie movie = new Movie();
                    movie.setName(name);
                    movie.setUrl(url);
                    jsonArray.add(movie);
                }
            }
//            String li = docs.select("li").text();
////            String title = elementsss.text();


        }
        return jsonArray;
    }
}
