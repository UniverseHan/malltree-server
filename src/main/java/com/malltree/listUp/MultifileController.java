package com.malltree.listUp;

import java.io.File;
import java.io.IOException;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class MultifileController {

  @RequestMapping("/upload01")  
  public String upolad1(      
          @RequestParam("string") String num,
          @RequestParam("image") MultipartFile file){
    
      String filename = file.getOriginalFilename();
      
      //실제 파일을 업로드하기 위한 파일 객체 생성
      File f = new File("\\static\\"+num+"_"+filename);
      System.out.println(f.getPath());
      
      //한번에 한해서 동일한 파일이 존재하면 이름에 (1) ,
      //(나중에)2번째에도 검사해서 이름을 편해보고, 확장자 앞에 다른 이름을 추가하도록 해보자 
      if(f.exists()){
          f = new File("\\static\\"+"(1)"+num+"_"+filename);
      }
  
      try {
          file.transferTo(f);
      } catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
      }
      
      
      return "success";
  }
  

}
