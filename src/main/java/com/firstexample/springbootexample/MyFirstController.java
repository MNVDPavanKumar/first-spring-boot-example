package com.firstexample.springbootexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("first")
public class MyFirstController {

    @GetMapping
    public String helloWorld()
    {
        System.out.println("Testing");
        return "Hello, Welcome to springboot";
    }
}
