package com.example.demo3.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "temp_categories")
public class Category {
    public Category(){

    }
    @Id
    private int id;
    @Column
    private String title;
    @Column
    private String description;
    @Column
    private boolean publication;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPublication() {
        return publication;
    }

    public void setPublication(boolean publication) {
        this.publication = publication;
    }
}
