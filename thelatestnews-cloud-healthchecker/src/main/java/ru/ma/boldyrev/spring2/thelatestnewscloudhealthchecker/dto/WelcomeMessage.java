package ru.ma.boldyrev.spring2.thelatestnewscloudhealthchecker.dto;

public class WelcomeMessage {

    private String name;

    public WelcomeMessage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
