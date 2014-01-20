package com.project.contactos.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.project.contactos.domain.SomeModel;
import com.project.contactos.utils.model.Bean;


/**
 * Book Service implementation with root path /book all jax-rs annotations will
 * be inherited
 */
@Component
@Scope("request")
@Path("test")
public class Test {
    @Autowired
    Bean bean;

    @GET
    @Path("/")
    public SomeModel getById() {
        System.out.println(bean.getId());
        SomeModel someModel = new SomeModel();
        someModel.setId("id");
        someModel.setValue("value");
        return someModel;
    }
}
