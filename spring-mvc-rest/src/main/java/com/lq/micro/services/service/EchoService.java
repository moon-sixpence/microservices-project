package com.lq.micro.services.service;

import com.lq.micro.services.mvc.anotation.TransactionalService;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description:
 * @date: 2020/11/12
 * @author: liuqiang
 * @email mosixpence@gmail.com
 */
@TransactionalService(value = "echoService2020")
public class EchoService {


    public void  echo(String message) {
        System.out.println(message);
    }
}
