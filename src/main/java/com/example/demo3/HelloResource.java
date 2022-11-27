package com.example.demo3;

import com.example.demo3.models.Category;
import jakarta.persistence.*;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;
import java.util.stream.Collectors;

@Path("/go")
public class HelloResource {


    @PersistenceContext
    EntityManager em;


    @GET
    @Produces(MediaType.APPLICATION_JSON + "; charset=UTF-8")

    public String hello() {
        TypedQuery<Category> categories = em.createQuery("select c from Category c", Category.class);
        List<Category> arr = categories.getResultList();

        return "Hello, World!" + arr.stream().map(w -> w.getTitle()).collect(Collectors.joining(","));
    }
}