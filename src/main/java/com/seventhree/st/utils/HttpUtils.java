package com.seventhree.st.utils;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.mysql.cj.xdevapi.JsonArray;
import okhttp3.*;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class HttpUtils {
    private static final String CONTENT_TYPE_TEXT_JSON = "text/json";

    private static final CloseableHttpClient httpClient = HttpClients.createDefault();

    private static final RequestConfig requestConfig = RequestConfig.custom()
            .setConnectTimeout(200000)
            .setSocketTimeout(100000).build();
    public static final MediaType JSONs= MediaType.parse("application/json; charset=utf-8");

    /**
     * GET请求  参数携带在url中
     *
     * @param url
     * @return
     */
    public static String executeGet(String url) {
        HttpGet httpGet = new HttpGet(url);
        httpGet.setConfig(requestConfig);
        CloseableHttpResponse response = null;
        String result = null;

        try {
            response = httpClient.execute(httpGet);

            HttpEntity entity = response.getEntity();
            if (entity != null) {
                result = EntityUtils.toString(entity, "UTF-8");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                response.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return result;
    }

    /**
     * POST请求 带参数
     *
     * @param url 请求地址
     * @param map 参数
     * @return
     */
    public static String executePost(String url, Map<String, String> map) {
        List<NameValuePair> params = new ArrayList<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            params.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
        }
        UrlEncodedFormEntity entity = null;
        String result = null;
        try {
            entity = new UrlEncodedFormEntity(params, "UTF-8");
            HttpPost httpPost = new HttpPost(url);
            httpPost.setConfig(requestConfig);
            httpPost.setEntity(entity);
            CloseableHttpResponse response = httpClient.execute(httpPost);

            HttpEntity httpEntity = response.getEntity();
            result = EntityUtils.toString(httpEntity, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }


    /**
     * POST请求   不带参数
     *
     * @param url
     * @return
     */
    public static String executePost(String url) {
        HttpPost httpPost = new HttpPost(url);
        httpPost.setConfig(requestConfig);
        CloseableHttpResponse response = null;
        String result = null;
        try {
            response = httpClient.execute(httpPost);

            HttpEntity entity = response.getEntity();
            result = EntityUtils.toString(entity, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }


    /**
     * POST请求   携带Json格式的参数
     *
     * @param url
     * @param param
     * @return
     * @throws IOException
     */
    public static String postJson(String url, Object param) {
        HttpPost httpPost = new HttpPost(url);
        httpPost.setHeader("Content-Type", "application/json;charset=UTF-8");

        httpPost.setConfig(requestConfig);
        String parameter = JSON.toJSONString(param);
        StringEntity se = null;
        try {
            System.out.println(parameter);
            se = new StringEntity(parameter);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        se.setContentType(CONTENT_TYPE_TEXT_JSON);
        httpPost.setEntity(se);

        CloseableHttpResponse response = null;
        String result = null;
        try {
            response = httpClient.execute(httpPost);

            HttpEntity httpEntity = response.getEntity();
            result = EntityUtils.toString(httpEntity, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }


    public static final OkHttpClient client = new OkHttpClient.Builder()
            .readTimeout(60, TimeUnit.SECONDS)//设置读取超时时间
            .writeTimeout(100, TimeUnit.SECONDS)//设置写的超时时间
            .connectTimeout(60, TimeUnit.SECONDS)//设置连接超时时间
            .build();

    public static String okHttpgGet(String url) throws IOException {
        Request request = new Request.Builder().url(url).get().build();
        Response response = client.newCall(request).execute();
        if (response.isSuccessful()) {
            return response.body().string();
        } else {
            throw new IOException("Unexpected code " + response);
        }
    }


    public static String OkHttpPost(String url, String content){
        //ssl认证重写
        OkHttpClient okHttpClient=new OkHttpClient.Builder().hostnameVerifier(
                new HostnameVerifier() {
                    @Override
                    public boolean verify(String s, SSLSession sslSession) {
                        return true;
                    }
                }
        ).build();
        RequestBody requestBody=new FormBody.Builder()
                .add("wd",content)
                .add("submit","search")
                .build();

//        RequestBody requestBody=RequestBody.create(JSONs,content);

        Request request=new Request.Builder()
                .url(url)
                .post(requestBody)
                .addHeader("Cookie","JSESSIONID=299571E0E40DA6E9962E41B87A669BBB")
                .addHeader("content-type", "application/json")
                .addHeader("cache-control", "no-cache")
                .build();
        Call call=okHttpClient.newCall(request);

        try {
            Response response=call.execute();
            return response.body().string();
//            System.out.println(response.body().string());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
