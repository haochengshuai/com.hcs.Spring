package com.hcs.result;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



/**
 * 项目启动类
 *
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan	
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}