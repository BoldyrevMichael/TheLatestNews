package ru.ma.boldyrev.spring2.thelatestnewssoap.entity;

import java.util.Date;

public class SourceOfEarning extends AbstractEntity {

    public static final String ENTITY_NAME = "SourceOfEarning";

    public static final String TABLE_NAME = PREFIX + ENTITY_NAME;

    private CategoryOfSourceOfEarning categoryOfSourceOfEarning;

    private String name = "";

    private String price = "";

    private Date executionDate;

    public SourceOfEarning() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Date getExecutionDate() {
        return executionDate;
    }

    public void setExecutionDate(Date executionDate) {
        this.executionDate = executionDate;
    }

    public CategoryOfSourceOfEarning getCategoryOfSourceOfEarning() {
        return categoryOfSourceOfEarning;
    }

    public void setCategoryOfSourceOfEarning(CategoryOfSourceOfEarning categoryOfSourceOfEarning) {
        this.categoryOfSourceOfEarning = categoryOfSourceOfEarning;
    }
}
