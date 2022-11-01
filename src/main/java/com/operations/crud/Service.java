package com.operations.crud;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class Service {
    Map<String,Integer> data=new HashMap<>();
      public Map<String,Integer> getAllData(){
     return data;
    }
    public String addUser(String name){
        data.put(name,0);
        return "successfull";
    
    }
    public String edituser(String name,Integer mark)
    {
        data.put(name,mark);
        return "done";
    }  
    public String deleteUser(String name){
        data.remove(name);
        return "successfull removed";
    }
}
