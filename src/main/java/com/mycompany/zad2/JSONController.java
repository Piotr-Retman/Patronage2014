package com.mycompany.zad2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.mycompany.zad2.Model;
@Controller
@RequestMapping("/api/hello")
public class JSONController { 
    @RequestMapping(value="{person}",method= RequestMethod.GET)
    public @ResponseBody Model jsoncontrol(@PathVariable("{person}") String person) {
        
        Model m = new Model();
        m.setPerson(person);
        
        return m;
        
    }
}