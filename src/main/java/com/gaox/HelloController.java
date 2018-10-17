package com.gaox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("sayHello")
    public String sayHello(){

        return "Hello SpringBoot1!";
    }

    @Autowired
    private YmlConfig ymlConfig;
    @RequestMapping("ymlConfig")
    public String ymlConfig(){

        return ymlConfig.getToString();
    }

    @Autowired
    private YmlConfig2 ymlConfig2;
    @RequestMapping("ymlConfig2")
    public String ymlConfig2(){

        return ymlConfig2.getToString();
    }
}
