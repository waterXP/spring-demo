package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenwenjie on 2019/5/5.
 *
 */
@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String index () {
        return "Hello world!";
    }
}
