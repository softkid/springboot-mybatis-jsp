package com.hwq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class HelloController {

    @RequestMapping(value = "index")
    public String topage(Map modele){
        modele.put("title","Hello World");
        return "index";
    }

    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello world 狐狸";
    }

}
