package com.mycompany.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.mycompany.zad2.Model;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
//@RequestMapping("")
public class JSONController {
    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody Object jsoncontrol(@RequestParam(value = "person") String person){
            
            Model m = new Model();
            
            m.setPerson("Hello,"+person);
            return m;
    }
}