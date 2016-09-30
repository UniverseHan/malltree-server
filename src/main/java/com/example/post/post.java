package com.example.post;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class post {
	
	@PostMapping(path = "/post", consumes = "application/json")
	public String post(@RequestBody String name, String age) {
	    // implementation omitted

        //Array에 입력
        return "NAME is " + name + "\tAGE is " + age;
        
	}




}
