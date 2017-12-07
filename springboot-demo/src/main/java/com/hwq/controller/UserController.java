package com.hwq.controller;

import com.hwq.entity.User;
import com.hwq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/user/query")
    @ResponseBody
    public User toselect(){
        return userService.select();
    }

}
