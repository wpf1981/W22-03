package com.example.w2203;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@SpringBootApplication
@EnableSwagger2WebMvc
public class W2203Application {

    public static void main(String[] args) {
        SpringApplication.run(W2203Application.class, args);
    }

}
