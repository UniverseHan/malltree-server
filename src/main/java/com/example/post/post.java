package com.example.post;


import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.test;

@RestController
public class post {
	
	// GET방식
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/post")
    public test greeting(
    		@RequestParam(value="name", defaultValue="World") String name,
    		@RequestParam(value="age", defaultValue="20") Integer age) 
    {
        return new test(
        		counter.incrementAndGet(),
        		String.format(template, name),
        		age);
    }
    
    //POST방식
	@PostMapping(path = "/post", consumes = "application/json")
	public String post(@RequestBody String name, String age) {
	    // implementation omitted

        //Array에 입력
        return "(Name) : " + name + "   (age) : " + age;
        
	}




}
