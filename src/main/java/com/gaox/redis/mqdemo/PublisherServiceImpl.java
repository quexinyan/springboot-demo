package com.gaox.redis.mqdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class PublisherServiceImpl implements PublisherService{

    private static final Logger log = LoggerFactory.getLogger(PublisherServiceImpl.class);

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Override
    public String sendMessage(String content) {

        try {
            redisTemplate.convertAndSend("TOPIC_MESSAGE", content);
            redisTemplate.convertAndSend("TOPIC_MESSAGE2", content);
            return "消息发送成功了";

        } catch (Exception e) {
            e.printStackTrace();
            return "消息发送失败了";
        }

    }
}
