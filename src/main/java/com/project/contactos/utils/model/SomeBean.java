package com.project.contactos.utils.model;

import org.springframework.stereotype.Component;

@Component
public class SomeBean implements Bean{
    private String id="id";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}
