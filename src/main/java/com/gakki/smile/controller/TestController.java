package com.gakki.smile.controller;


import com.gakki.smile.bean.People;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Arrays;


@RestController()
public class TestController {


    @GetMapping(value = "/hello")
    public Object test(){

      return Arrays.asList(new People("wsj",20),new People("pqy",30));

    }

}
