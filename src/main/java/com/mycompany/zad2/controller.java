package com.mycompany.zad2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.mycompany.zad2.controller;
@Controller
@RequestMapping("/api/hello")
public class controller { 
    @RequestMapping(value="{person}",method= RequestMethod.GET)
    public @ResponseBody String controller(@PathVariable String person) {
        
        model m = new model();
        m.setPerson(person);
        
        return m.getPerson();
        
    }
}