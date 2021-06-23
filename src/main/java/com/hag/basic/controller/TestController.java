package com.hag.basic.controller;

import com.hag.basic.util.RedisUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "用户管理")
@RestController()
@RequestMapping("/test")
public class TestController {

    @Autowired
    RedisUtils redisUtils;

    /* Hello world*/
    @ApiOperation("Hello world*")
    @GetMapping("/hi")
    public String hi(){
        return "helloWorld!";
    }

    /* Redis test */
    @ApiOperation("Redis test")
    @GetMapping("/redis")
    public String redis(){
        redisUtils.set("redis","1234");
        String demo = redisUtils.get("redis").toString();
        return demo;
    }
}
