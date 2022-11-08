package com.javacodegeeks.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {
	String companyName = System.getenv("CUSTOMER_NAME");
	String name1 = "testuser";
	String name2 = "sample2";

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello " + companyName + " Welcome To Guide-Rails®!";
	}

        public String test() {
            return "Test";
        }
}
