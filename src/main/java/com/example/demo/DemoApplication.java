package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
@SpringBootApplication
public class DemoApplication {
	@RequestMapping(value = "/sayHello")
	@ResponseBody
	public String sayHello (String name) {
		return "Hello, " + name;
	}

	@RequestMapping(value = "/")
	@ResponseBody
	public String index () {
		return "Login";
	}

	public static void main (String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
