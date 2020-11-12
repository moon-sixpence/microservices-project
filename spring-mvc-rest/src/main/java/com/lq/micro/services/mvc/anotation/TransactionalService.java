package com.lq.micro.services.mvc.anotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Transactional
@Service
public @interface TransactionalService {

    @AliasFor(annotation = Service.class,attribute = "value")
    String value() default "";

    @AliasFor(annotation = Transactional.class,attribute = "value")
    String transactionManager() default "";
}
