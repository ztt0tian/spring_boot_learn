package com.example.springweb.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ZttProperties {
    @Value("${com.ztt.title}")
    private String title;
    @Value("${com.ztt.desc}")
    private String desc;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
