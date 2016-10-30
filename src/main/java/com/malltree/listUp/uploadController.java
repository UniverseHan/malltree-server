package com.malltree.listUp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class uploadController {
  
  ArrayList<Product> items = new ArrayList<Product>();

  
  @PostMapping(path = "/get-items", consumes = "application/json")
  public String post(@RequestBody AddItemList request) {
    // implementation omitted    
    
    items.add( new Product(request.getName(), request.getPrice()) );
    
    System.out.println("number of items is " + items.size());

    return "(Name) : " + request.getName() + "   (price) : " + request.getPrice();
  }  
  
  @RequestMapping("/list-items")
  public List<Product> getItemList() {
    return items;
  }
	
}
