package com.jinwang.weixin.controller;

import com.jinwang.utils.RedisUtil;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @Author jinwang
 * @Date 2024/11/6 17:09
 * @Version 1.0 （版本号）
 */
@RestController
@Slf4j
public class testController {

    @Resource
    RedisUtil redisUtil;

    @RequestMapping("/testredis")
    public String test(){
        redisUtil.setNx("test","test", 1L, TimeUnit.MINUTES);
        return "success";
    }
}
