package org.lq.webmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


/**
 * @description: <br/>
 * @date: 2020/11/3
 * @author: liuqiang
 * @email sx_moon_sixpence@163.com
 */
@Controller
public class IndexController {

    @GetMapping(value = {"/"})
    public String index(Model model) {
        //model.addAttribute("message","hello,lq");
        return "index";
    }

    @ModelAttribute(name = "message")
    public String message() {
        return "hello,world";
    }

}
