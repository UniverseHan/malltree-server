package com.malltree.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

//@Controller
@RestController
public class testController {
//
//  //GET방식
//  private static final String template = "http://test12.dothome.co.kr/images/%s";
//  private final AtomicLong counter = new AtomicLong();
//  
//
//  @RequestMapping("/test")
//  public test greeting(
//      @RequestParam(value="content", defaultValue="on.png") String content,
//      @RequestParam(value="age", defaultValue="20") Integer age)
//  {
//    return new test(
//        counter.incrementAndGet(),
//        String.format(template, content),
//        age);
//  }
//
//  //Array
//  ArrayList<Item> items = new ArrayList<Item>();
//
//  //POST방식 
//  @PostMapping(path = "/get-items", consumes = "application/json")
//  public String post(@RequestBody AddItemRequest request) {
//    // implementation omitted    
//    
//    items.add( new Item(request.getName(), request.getPrice()) );
//    
//    System.out.println("number of items is " + items.size());
//
//    //Array에 입력
//    return "(Name) : " + request.getName() + "   (price) : " + request.getPrice();
//
//  }
//  
//  @RequestMapping("/list-items")
//  public List<Item> getItemList() {
//    return items;
//  }
  
  // #############Image upload receive###########
  
//  private final StorageService storageService;
//
//  @Autowired
//  public testController(StorageService storageService) {
//      this.storageService = storageService;
//  }
//  
//  @PostMapping("/upload-image")
//  public String handleFileUpload(@RequestParam("file_img") MultipartFile file,
//                                 RedirectAttributes redirectAttributes) {
//
//      storageService.store(file);
//      redirectAttributes.addFlashAttribute("message",
//              "You successfully uploaded " + file.getOriginalFilename() + "!");
//
//      return "redirect:/";
//  }
//  
  

}

