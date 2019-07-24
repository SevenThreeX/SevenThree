//package com.seventhree.st.controller;
//
//import java.io.InputStream;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.util.HashMap;
//import java.util.Map;
//
//public class Test {
//
//    private static int startUserId = 73528;
//    private static int endUserId = 75608;
//    private static String unit = "BAT";
//
//    public static void main(String[] args) {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = startUserId; i <= endUserId; i++) {
//                    try {
//                        Thread.sleep(2000);
//                    } catch (InterruptedException e) {
//                        String message = e.getMessage();
//                        System.out.println(message == null ? "未知错误" : message);
//                    }
//                    fun(i);
//                }
//            }
//        }).start();
//    }
//
//    private static void fun(int userId) {
//        Map<String, Object> map = new HashMap<>();
//        map.put("unit", unit);
//        map.put("uid", userId);
//        String json = post(map);
//        System.out.println(json);
//    }
//
//    private static String post(Map<String, Object> param) {
//        StringBuilder builder = new StringBuilder();
//        try {
//            StringBuilder params = new StringBuilder();
//            for (Map.Entry<String, Object> entry : param.entrySet()) {
//                params.append(entry.getKey());
//                params.append("=");
//                params.append(entry.getValue().toString());
//                params.append("&");
//            }
//            if (params.length() > 0) {
//                params.deleteCharAt(params.lastIndexOf("&"));
//            }
//            URL restServiceURL = new URL("http://compasschain.io:9090/admin/member/member-wallet/reset-address-test" + (params.length() > 0 ? "?" + params.toString() : ""));
//            HttpURLConnection httpConnection = (HttpURLConnection) restServiceURL.openConnection();
//            httpConnection.setRequestMethod("POST");
//            httpConnection.setRequestProperty("Accept", "application/json");
//            httpConnection.setDoInput(true);
//            httpConnection.setUseCaches(false);
//            if (httpConnection.getResponseCode() != 200) {
//                throw new RuntimeException("HTTP POST Request Failed with Error code : "
//                        + httpConnection.getResponseCode());
//            }
//            InputStream inStrm = httpConnection.getInputStream();
//            byte[] b = new byte[1024];
//            int length;
//            while ((length = inStrm.read(b)) != -1) {
//                builder.append(new String(b, 0, length));
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        return builder.toString();
//    }
//}
//
//
