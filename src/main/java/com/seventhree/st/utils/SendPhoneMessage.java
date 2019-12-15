package com.seventhree.st.utils;


import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;

import java.io.IOException;
import java.net.URLEncoder;


public class SendPhoneMessage {


	/**
     * @param
     * @throws IOException
     * @throws HttpException
     */
	   public static int sendMsg(String phone,String code) throws HttpException, IOException {
        HttpClient client=new HttpClient();
        PostMethod post=new PostMethod("http://gbk.sms.webchinese.cn");
        //��ͷ�ļ�������ת��
        post.addRequestHeader("Content-Type","application/x-www-form-urlencoded;charset=gbk");
        NameValuePair[] data={
                new NameValuePair("Uid","呱呱坠地"),
                new NameValuePair("Key","d41d8cd98f00b204e980"),
                new NameValuePair("smsMob",phone),
                new NameValuePair("smsText","验证码:"+code)
        };
        post.setRequestBody(data);
        client.executeMethod(post);
        Header[] headers=post.getRequestHeaders();
        int statusCode=post.getStatusCode();
        System.out.println("statusCode:"+statusCode);
        for(Header h:headers){
            System.out.println(h.toString());
        }
        String result=new String(post.getResponseBodyAsString().getBytes("gbk"));
        System.out.println(result);
        post.releaseConnection();
        return statusCode;
    }

        /*
         * 发送国际短信
         */
        public static int sendInternalMsg(String phone,String code) throws Exception {
                HttpClient httpClient = new HttpClient();
                PostMethod postMethod = new PostMethod("http://intlapi.1cloudsp.com/intl/api/v2/send");
                postMethod.getParams().setContentCharset("UTF-8");
                postMethod.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,new DefaultHttpMethodRetryHandler());

                String accesskey = "cqp5pdWvW2DgRvJq"; //用户开发key
                String accessSecret = "vNUecpBmSNxTvnrDPXMTFIvzrH4y72Qr"; //用户开发秘钥

                NameValuePair[] data = {
                        new NameValuePair("accesskey", accesskey),
                        new NameValuePair("secret", accessSecret),
                        new NameValuePair("sign", "2087"),
                        new NameValuePair("templateId", "2863"),
                        new NameValuePair("mobile", phone),
                        new NameValuePair("content", URLEncoder.encode(code, "utf-8"))//（示例模板：{1}您好，您的订单于{2}已通过{3}发货，运单号{4}）
                };
                postMethod.setRequestBody(data);
                postMethod.setRequestHeader("Connection", "close");

                int statusCode = httpClient.executeMethod(postMethod);
                System.out.println("statusCode: " + statusCode + ", body: "
                        + postMethod.getResponseBodyAsString());
                return statusCode;
        }
}