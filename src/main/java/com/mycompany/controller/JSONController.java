package com.mycompany.controller;

import com.mycompany.zad2.Messages;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.mycompany.zad2.User;
import java.util.LinkedList;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/api/users")
public class JSONController {

    public List<User> lista = new LinkedList<User>();

    //POST
    @RequestMapping(value = "", method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody
    Object post() {
        if (lista.isEmpty()) {
            lista.add(0, new User(lista.size() + 1, "krol.julian", "krol.julian@blstream.com"));
            Messages m = new Messages();
            m.setMessage("New user with id:1 was created successfully!");
            return m;
        } else {
            int liczba = lista.size();
            int idUser = liczba+1;
            lista.add(liczba, new User(idUser, "krol.julian", "krol.julian@blstream.com"));
            Messages m = new Messages();
            m.setMessage("New user with id:" + idUser + "was created successfully!");
            return m;
        }
    }
    //DELETE

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public @ResponseBody
    Object delete(@PathVariable("id") int id) {
        int idUser = id;
        id--;
        lista.remove(id);
        Messages m = new Messages();
        m.setMessage("User with id:" + idUser + "was removed successfully!");
        return m;
    }
    //PUT 1

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT, produces = "application/json")
    public @ResponseBody
    Object put(@PathVariable("id") int id) {
        int idUser = id;
        id--;
        lista.set(id, new User(idUser, "krol.julian", "krol.julian@example.com"));
        Messages m = new Messages();
        m.setMessage("User with id:" + idUser + " was updated successfully!");
        return m;
    }
    //GET 

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    Object getUser(@PathVariable("id") int id) {
        id--;
        return lista.get(id);
    }
    //GET-list

    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    Object getList() {
            return lista;
    }
}