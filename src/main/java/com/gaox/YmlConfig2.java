package com.gaox;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 将application.yml文件中的test.user注入到User对象里，注意这里的prefix指定的是test.user，对应配置文件中的结构
 */
@Component
@ConfigurationProperties(prefix = "test.user")
public class YmlConfig2 {

    private String username;
    private String age;
    private String toString;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getToString() {
        return toString;
    }

    public void setToString(String toString) {
        this.toString = toString;
    }
}
