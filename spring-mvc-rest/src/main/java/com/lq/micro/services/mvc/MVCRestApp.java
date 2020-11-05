package com.lq.micro.services.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @description: <br/>
 * @date: 2020/11/5
 * @author: liuqiang
 * @email
 */
@EnableAutoConfiguration
@ComponentScan
public class MVCRestApp {

    public static void main(String[] args) {

        new SpringApplication(MVCRestApp.class)
                .run(args);
    }
}
