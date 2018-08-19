package ru.ma.boldyrev.spring2.thelatestnews.entity;

import java.util.UUID;

public class Article {

    private String id = UUID.randomUUID().toString();

    private String name;

    private String content;

    private Category category;

    public Article() {
    }

    public Article(String name, String content, Category category) {
        this.name = name;
        this.content = content;
        this.category = category;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
