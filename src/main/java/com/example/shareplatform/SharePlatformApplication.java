package com.example.shareplatform;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.shareplatform.api.*.dao.mapper")
public class SharePlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(SharePlatformApplication.class, args);
    }

}

