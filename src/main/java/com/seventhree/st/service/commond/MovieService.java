package com.seventhree.st.service.commond;

import com.alibaba.fastjson.JSONArray;

public interface MovieService {

    JSONArray getMovie(String html);
    JSONArray getMovieDetails(String html);
}
