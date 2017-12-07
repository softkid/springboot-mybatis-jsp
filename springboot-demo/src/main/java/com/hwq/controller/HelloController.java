package com.hwq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping(value = "/index")
    public String topage(){

        return "index";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello world 狐狸";
    }

}
