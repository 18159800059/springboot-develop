package com.controller;

import com.event.MyEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 通过请求来发布事件
 * @author ：lyk
 * @date ：Created in 2019/3/6 20:35
 */
@RestController
public class Operation {

    @Autowired
    ApplicationEventPublisher publisher;

    @GetMapping(value = "/execute")
    public String execute(){
        publisher.publishEvent(new MyEvent(new Object()));
        return "<h1>success<h1/>!";
    }



}
