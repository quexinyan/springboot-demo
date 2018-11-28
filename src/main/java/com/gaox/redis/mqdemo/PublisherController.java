package com.gaox.redis.mqdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/publish")
public class PublisherController {

    @Autowired
    private PublisherService publisherService;

    @RequestMapping("{message}")
    public String sendMessage(@PathVariable("message") String message){
        List<String> strLists = new ArrayList<>();
        for(int i =0 ;i<10;i++){
            String result =  publisherService.sendMessage(message+i);
            strLists.add(result);
        }
        return strLists.toString();
    }
}
