package ru.ma.boldyrev.spring2.thelatestnewssoap.entity;

import java.util.List;

public class CategoryOfSourceOfEarning extends AbstractEntity {

    public static final String ENTITY_NAME = "CategoryOfSourceOfEarning";

    public static final String TABLE_NAME = PREFIX + ENTITY_NAME;

    private List<SourceOfEarning> listOfSourceOfEarning;

    private String name = "";

    public CategoryOfSourceOfEarning() {
    }

    public List<SourceOfEarning> getListOfSourceOfEarning() {
        return listOfSourceOfEarning;
    }

    public void setListOfSourceOfEarning(List<SourceOfEarning> listOfSourceOfEarning) {
        this.listOfSourceOfEarning = listOfSourceOfEarning;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
