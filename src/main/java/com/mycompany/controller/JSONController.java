package com.mycompany.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.mycompany.zad2.Model;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@RequestMapping("/api/hello")
public class JSONController {
    @RequestMapping(value = "person",method = RequestMethod.GET)
    public @ResponseBody Model jsoncontrol(@RequestParam String person) {
        Model m = new Model();
        m.setPerson(person);
        return m;
        
    }
}