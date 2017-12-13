package com.hwq.controller;

import com.hwq.entity.User;
import com.hwq.service.UserCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class CacheController {

    @Autowired
    private UserCache userCache;

    @RequestMapping(value = "/select", method = RequestMethod.GET)
    public User get(@RequestParam(defaultValue = "1") Integer id) {
        return userCache.selectById(id);
    }

    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public User update(@RequestParam(defaultValue = "1") Integer id) {
        User bean = userCache.selectById(id);
        bean.setName("测试");
        bean.setCreateTime(new Date());
        userCache.updateById(bean);
        return bean;
    }

    @RequestMapping(value = "/del", method = RequestMethod.GET)
    public String del(@RequestParam(defaultValue = "1") Integer id) {
        return userCache.deleteById(id);
    }
}
