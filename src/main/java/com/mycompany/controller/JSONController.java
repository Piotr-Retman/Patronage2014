package com.mycompany.controller;
import com.mycompany.zad2.Messages;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.mycompany.zad2.User;
import java.util.Dictionary;
import java.util.LinkedList;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping("")
public class JSONController {
    public List<User> lista = new LinkedList<User>();
    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody Object get(Long id,String email,String username){
            lista.add(0,new User(1L, "krol.julian", "krol.julian"));
            lista.add(1,new User(2L, "krol.julian", "krol.julian"));
            return lista;
    }
    @RequestMapping(value = "/2", method = RequestMethod.DELETE, produces = "application/json")
    public @ResponseBody Object delete(){
            lista.clear();
            return lista;
    }
//    @RequestMapping(value = "", method = RequestMethod.PUT, produces = "application/json")
//    public @ResponseBody Object put(@RequestParam(value = "person") String message){
//            
//            User m = new User();
//            m.setMessage("Hello,"+message);
//            return m;
//    }
    @RequestMapping(value = "/1", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody Object getUser(){
            return lista.get(0);
    }
}