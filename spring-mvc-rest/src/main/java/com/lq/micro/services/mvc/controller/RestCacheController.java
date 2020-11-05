package com.lq.micro.services.mvc.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @date: 2020/11/5
 * @author: liuqiang
 * @email mosixpence@gmail.com
 */
@Controller
public class RestCacheController {


    @RequestMapping
    @ResponseBody
    public  String helloWorld() {
        return "hello,World";
    }



    @RequestMapping("/cache")
    public ResponseEntity<String> cacheHelloWorld(@RequestParam(required = false,defaultValue = "false")  boolean cached){

        if (cached) {
            return new ResponseEntity(HttpStatus.NOT_MODIFIED);
        }
        return ResponseEntity.ok("hello,lq");

    }

}
