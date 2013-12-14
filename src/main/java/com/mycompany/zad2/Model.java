package com.mycompany.zad2;

import org.springframework.web.bind.annotation.ModelAttribute;

public class Model {
    
    private String message;
    @ModelAttribute
    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
