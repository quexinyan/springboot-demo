package com.gaox.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *  redis 连接测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestController {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Test
    public void helloRedis(){

        // 设置数据
        redisTemplate.opsForValue().set("name", "hello redis");

        // 取数据
        String result = redisTemplate.opsForValue().get("name");
        System.out.println(result);
    }
}
