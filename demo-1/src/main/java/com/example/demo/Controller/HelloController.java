package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
	@GetMapping("/")
	public String helloController()
	{
		return "Hello Everyone";
	}
	

}
