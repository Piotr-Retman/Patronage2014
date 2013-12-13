package com.mycompany.zad2;

import org.springframework.web.bind.annotation.ModelAttribute;

public class Model {
    
    private String person;
    @ModelAttribute
    public void setPerson(String person) {
        this.person = person;
    }

    public String getPerson() {
        return person;
    }
}
