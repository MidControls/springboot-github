package com.gakki.smile.controller;


import com.gakki.smile.bean.People;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class TestController {


    @GetMapping(value = "/hello")
    public Object test(){
        return new People("wsj",20);
    }

}
