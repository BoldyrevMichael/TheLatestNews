package ru.ma.boldyrev.spring2.thelatestnews.entity;


import org.hibernate.annotations.CreationTimestamp;
import org.jetbrains.annotations.NotNull;

import javax.persistence.*;
import java.util.Date;

@Table(name = SourceOfEarning.TABLE_NAME)
@Entity(name = SourceOfEarning.ENTITY_NAME)
public class SourceOfEarning extends AbstractEntity {

    @NotNull
    public static final String ENTITY_NAME = "SourceOfEarning";

    @NotNull
    public static final String TABLE_NAME = PREFIX + ENTITY_NAME;

    @ManyToOne
    @JoinColumn(name = "category_of_source_of_earning")
    private CategoryOfSourceOfEarning categoryOfSourceOfEarning;

    @NotNull
    private String name = "";

    @NotNull
    private String price = "";

    @CreationTimestamp
    @Column(name = "execution_date")
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
