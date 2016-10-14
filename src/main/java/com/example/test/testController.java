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
  

  @RequestMapping("/test")
  public test greeting(
      @RequestParam(value="content", defaultValue="on.png") String content,
      @RequestParam(value="age", defaultValue="20") Integer age)
  {
    return new test(
        counter.incrementAndGet(),
        String.format(template, content),
        age);
  }


  //POST방식 
  @PostMapping(path = "/get-items", consumes = "application/json")
  public String post(@RequestBody AddItemRequest request) {
    // implementation omitted    
    
    items.add( new Item(request.getName(), request.getPrice()) );
    
    System.out.println("number of items is " + items.size());

    //Array에 입력
    return "(Name) : " + request.getName() + "   (price) : " + request.getPrice();
  }
  

  //Array
  ArrayList<Item> items = new ArrayList<Item>();
  
  @RequestMapping("/list-items")
  public List<Item> getItemList() {
    return items;
  }
  

}


