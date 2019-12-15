package com.seventhree.st.international.utils;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;
import java.util.ResourceBundle;

public class International {
    public static final String LANGUAGE = "Accept-Language";
    public static ResourceBundle getLanguage(HttpServletRequest request) {

        String language = request.getHeader(LANGUAGE);
        if (language == null || language.equals("")) {
            language = "zh-CN,zh";
        }
        ResourceBundle myResourcesBundle = null;
        System.out.println(language);
        if (language.contains("zh")) {
            myResourcesBundle = ResourceBundle.getBundle("com.sidianzhong.sdz.international.myresource", Locale.CHINA);
        }
        if (language.contains("tw")) {
            myResourcesBundle = ResourceBundle.getBundle("com.sidianzhong.sdz.international.myresource", Locale.TAIWAN);
        }
        if (language.contains("ko")) {
            myResourcesBundle = ResourceBundle.getBundle("com.sidianzhong.sdz.international.myresource", Locale.KOREA);
        }
        if (language.contains("en")) {
            myResourcesBundle = ResourceBundle.getBundle("com.sidianzhong.sdz.international.myresource", Locale.US);
        }
        return myResourcesBundle;
    }
}
