package com.example.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

  //GET방식
  private static final String template = "http://test12.dothome.co.kr/images/%s";
  private final AtomicLong counter = new AtomicLong();
  
  //Array
  ArrayList<Item> items = new ArrayList<Item>();

  @RequestMapping("/test")
  public test greeting(
      @RequestParam(value="name", defaultValue="on.png") String name,
      @RequestParam(value="age", defaultValue="20") Integer age) 
  {
    return new test(
        counter.incrementAndGet(),
        String.format(template, name),
        age);
  }
  
  @RequestMapping("/items")
  public List<Item> getItemList() {
    return items;
  }


  //POST방식
  @PostMapping(path = "/test", consumes = "application/json")
  public String post(@RequestBody AddItemRequest request) {
    // implementation omitted
    
    
    items.add( new Item(request.getName(), request.getPrice()));
    
    System.out.println("number of items is " + items.size());

    //Array에 입력
    return "(Name) : " + request.getName() + "   (age) : " + request.getPrice();

  }

}


