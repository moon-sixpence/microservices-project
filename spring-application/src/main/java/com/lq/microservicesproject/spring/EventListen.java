package com.lq.microservicesproject.spring;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @description: <br/>
 * @date: 2020/11/3
 * @author: liuqiang
 * @email sx_moon_sixpence@163.com
 */
public class EventListen {

    public static void main(String[] args) {
        GenericApplicationContext context = new GenericApplicationContext();

        context.addApplicationListener(new ApplicationListener<ApplicationEvent>() {

                       @Override
                       public void onApplicationEvent(ApplicationEvent event) {
                           System.err.println("监听事件" + event.getSource());

                       }
                   }

        );

        context.refresh();
        ;

        context.publishEvent("helloWorld");
    }
}
