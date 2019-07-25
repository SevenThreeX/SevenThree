package com.seventhree.st.annotation;

import java.lang.annotation.*;

public class CustomAnnotations {
//  跳过验证
    @Documented
    @Target({ElementType.METHOD, ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface PassToken {
        boolean required() default true;
    }

//  登录验证
    @Documented
    @Target({ElementType.METHOD, ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface UserLoginToken {
        boolean required() default true;
    }
}
