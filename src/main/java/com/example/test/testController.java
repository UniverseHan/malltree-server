package com.example.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
	@RequestMapping("/test")
	public String test(){
		return "<h1>hello STS!!!</h1>";		
	}
}
