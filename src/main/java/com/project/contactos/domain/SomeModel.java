package com.project.contactos.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SomeModel {
    private String id;
    private String value;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
