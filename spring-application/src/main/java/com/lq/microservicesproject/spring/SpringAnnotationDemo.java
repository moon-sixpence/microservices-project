package com.lq.microservicesproject.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

/**
 * @description: <br/>
 * @date: 2020/11/2
 * @author: liuqiang
 * @email sx_moon_sixpence@163.com
 */
@Configuration
public class SpringAnnotationDemo {

    public static void main(String[] args) {


        AnnotationConfigApplicationContext configApplicationContext
                = new AnnotationConfigApplicationContext();

        //configApplicationContext
        configApplicationContext.register(SpringAnnotationDemo.class);

        configApplicationContext.refresh();

        System.out.println(configApplicationContext.getBean(SpringAnnotationDemo.class));
    }
}
