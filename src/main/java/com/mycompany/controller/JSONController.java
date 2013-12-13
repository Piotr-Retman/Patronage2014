package com.mycompany.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.mycompany.zad2.Model;
import javax.servlet.http.HttpServletResponse;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@RequestMapping("/api/hello")
public class JSONController {
    @RequestMapping(value="{person}",method = RequestMethod.GET,produces = "application/json")
    public @ResponseBody Model jsoncontrol(@RequestParam(value = "person") String person) {
        Model m = new Model();
        m.setPerson(person);
        
        return m;
        
    }
}