package com.example.Springbootpractice.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String helloWorld()
    {
        return "hello world this is a beautiful world";
    }
}
