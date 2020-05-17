package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.**.mapper")
public class SpringbootMybatisPlusGenratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisPlusGenratorApplication.class, args);
    }
}
