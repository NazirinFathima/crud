package com.operations.crud;

import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class Controller {
Service s=new Service();


    @GetMapping("/all")
    public  Map<String,Integer> getAllData(){
      return s.getAllData();
    }
    @PostMapping("/adduser")
    public String adddata(@RequestBody String name){
        return s.addUser(name);

    }
    @PatchMapping("/edituser/{name}/{mark}")
    public String edituser(@PathVariable String name,@PathVariable Integer mark){
        return s.edituser(name, mark);
    }
    @DeleteMapping("/deleteuser")
    public String deleteuser(@RequestBody String name){
        return s.deleteUser(name);
    }
    
}
