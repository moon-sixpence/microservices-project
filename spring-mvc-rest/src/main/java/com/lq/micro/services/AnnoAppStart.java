package com.lq.micro.services;

import com.lq.micro.services.service.EchoService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.support.DefaultTransactionStatus;

import java.util.Map;

/**
 * @description:
 * @date: 2020/11/12
 * @author: liuqiang
 * @email mosixpence@gmail.com
 */
@ComponentScan(basePackages = "com.lq.micro.services.service")
@EnableTransactionManagement
public class AnnoAppStart {

    @Component
    public class  MyPlatformTransactionManagement implements PlatformTransactionManager {

        @Override
        public TransactionStatus getTransaction(TransactionDefinition transactionDefinition) throws TransactionException {
            return new DefaultTransactionStatus(null,true,true,transactionDefinition.isReadOnly()
            ,false,null);
        }

        @Override
        public void commit(TransactionStatus transactionStatus) throws TransactionException {
            System.out.println("commit ...");
        }

        @Override
        public void rollback(TransactionStatus transactionStatus) throws TransactionException {
            System.out.println("rollback ...");
        }
    }


    public static void main(String[] args) {


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.register(AnnoAppStart.class);

        context.refresh();




        AnnoAppStart start = context.getBean(AnnoAppStart.class);

        System.out.println(start);

        Map<String, EchoService> beansOfType = context.getBeansOfType(EchoService.class);
        beansOfType.forEach((name,bean)->{
            System.err.println("beanName:"+ name + ", bean:" + bean);
            bean.echo("hello,world");
        });


        context.close();
    }
}
