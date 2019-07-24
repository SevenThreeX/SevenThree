package com.seventhree.st;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.seventhree.st.mapper")
public class StApplication {

    public static void main(String[] args) {
        SpringApplication.run(StApplication.class, args);
    }

}
