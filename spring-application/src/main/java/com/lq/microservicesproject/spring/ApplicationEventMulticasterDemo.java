package com.lq.microservicesproject.spring;

import org.springframework.context.PayloadApplicationEvent;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.event.SimpleApplicationEventMulticaster;

/**
 * @description: <br/>
 * @date: 2020/11/3
 * @author: liuqiang
 * @email sx_moon_sixpence@163.com
 */
public class ApplicationEventMulticasterDemo {

    public static void main(String[] args) {
        ApplicationEventMulticaster multicaster = new
                SimpleApplicationEventMulticaster();

        multicaster.addApplicationListener(event -> {
            System.out.println("接收到事件"+ event);

        });

        // 发布事件
        multicaster.multicastEvent(new PayloadApplicationEvent<Object>("1","HelloWorld"));
        multicaster.multicastEvent(new PayloadApplicationEvent<Object>("2","HelloWorld"));
    }
}
