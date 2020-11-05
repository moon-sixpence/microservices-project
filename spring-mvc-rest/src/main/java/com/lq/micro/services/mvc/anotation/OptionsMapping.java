package com.lq.micro.services.mvc.anotation;

import org.springframework.core.annotation.AliasFor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.annotation.*;

/**
 * @description:
 * @date: 2020/11/5
 * @author: liuqiang
 * @email mosixpence@gmail.com
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@RequestMapping(method = RequestMethod.OPTIONS)
//  如果不增加元注解， 会报错
public @interface OptionsMapping {

    // 需要重新定义属性

    @AliasFor(annotation =  RequestMapping.class)
            // 指定之后，RequestMethod的属性
    String name() default "";



}
