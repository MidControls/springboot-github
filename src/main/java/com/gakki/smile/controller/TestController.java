package com.gakki.smile.controller;


import com.gakki.smile.bean.People;
import com.gakki.smile.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Arrays;


@RestController()
public class TestController {


    @GetMapping(value = "/hello")
    public Object test(){

      return Arrays.asList(new People("wsj",20),new People("hjj",30));
    }

    @GetMapping(value = "/test")
    public Object student(){

        return new Student("wsj",90.5,88.0,89.0);
    }

}
