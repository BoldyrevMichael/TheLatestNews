package ru.ma.boldyrev.spring2.thelatestnewssoap.entity;

import java.util.UUID;

public class AbstractEntity {

    public static final String PREFIX = "app_";

    private String id = UUID.randomUUID().toString();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}