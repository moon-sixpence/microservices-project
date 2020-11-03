package com.lq.microservicesproject.spring;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @description: <br/>
 * @date: 2020/11/3
 * @author: liuqiang
 * @email sx_moon_sixpence@163.com
 */
@EnableAutoConfiguration
public class SpringBootEventDemo {

    public static void main(String[] args) {
        new SpringApplicationBuilder((SpringBootEventDemo.class))
                .listeners(event -> {
                    System.err.println("监听到事件：" + event.getClass().getName());
                })
                .run(args)
                .close();
        ;
    }
}
