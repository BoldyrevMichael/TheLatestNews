package ru.boldyrev.ma.spring2.thelatestnews.model;

import java.util.UUID;

public class Category {

    private String id = UUID.randomUUID().toString();

    private String name;

    public Category() {
    }

    public Category(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
