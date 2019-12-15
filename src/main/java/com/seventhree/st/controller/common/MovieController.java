package com.seventhree.st.controller.common;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.seventhree.st.international.utils.International;
import com.seventhree.st.model.commond.Movie;
import com.seventhree.st.model.commond.UserToken;
import com.seventhree.st.service.commond.MovieService;
import com.seventhree.st.utils.HttpUtils;
import com.seventhree.st.utils.ResultModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

@Api(description = "电影解析")
@Controller
public class MovieController {
    @Autowired
    MovieService movieService;

    @ApiOperation(value = "查询电影", notes="根据关键字查询电影")
    @RequestMapping(value="/getMovie",method= RequestMethod.GET , produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Object getMovie(
            HttpServletRequest request,
            @RequestHeader(value = "X-Auth-Token", required = false) String token,
            @RequestParam(value = "value") String value
    ){
        String url = "http://api.zuixinapi.com/index.php?m=vod-search";
        String post = HttpUtils.OkHttpPost(url, value);
        JSONArray jsonArray = movieService.getMovie(post);
        return new ResponseEntity<>(ResultModel.ok(jsonArray), HttpStatus.OK);
    }

    @ApiOperation(value = "电影详情", notes="查询电影详情")
    @RequestMapping(value="/getMovieDetails",method= RequestMethod.GET , produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Object getMovieDetails(
            HttpServletRequest request,
            @RequestHeader(value = "X-Auth-Token", required = false) String token,
            @RequestParam(value = "value") String value
    ) throws IOException {

        String url = "http://api.zuixinapi.com";
        String post = HttpUtils.okHttpgGet(url+value);
//        System.out.println(post);
        JSONArray jsonArray = movieService.getMovieDetails(post);
        int size = jsonArray.size();
        JSONArray jsonArray1 = new JSONArray();
        for (int i=0;i<size/2;i++){
            jsonArray1.add(jsonArray.get(i));
        }
        return new ResponseEntity<>(ResultModel.ok(jsonArray1), HttpStatus.OK);
    }
}
