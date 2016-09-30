package com.example.test;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/test")
    public test greeting(
    		@RequestParam(value="name", defaultValue="World") String name,
    		@RequestParam(value="age", defaultValue="20") Integer age) 
    {
        return new test(
        		counter.incrementAndGet(),
        		String.format(template, name),
        		age);
    }
    
    
//	@RequestMapping(value="/test", method=RequestMethod.GET)
//	public String test(){
//		System.out.println("get request received");
//		return "<h1>hello STS!!!</h1>";		
//	}
//	
	@RequestMapping(value="/product", method=RequestMethod.GET)
	public String addProduct() {
		return "Added";
	}

}


