package ru.ma.boldyrev.spring2.thelatestnews.entity;


import org.jetbrains.annotations.NotNull;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Table(name = CategoryOfSourceOfEarning.TABLE_NAME)
@Entity(name = CategoryOfSourceOfEarning.ENTITY_NAME)
public class CategoryOfSourceOfEarning extends AbstractEntity {

    @NotNull
    public static final String ENTITY_NAME = "CategoryOfSourceOfEarning";

    @NotNull
    public static final String TABLE_NAME = PREFIX + ENTITY_NAME;

    @OneToMany(mappedBy = "categoryOfSourceOfEarning")
    private List<SourceOfEarning> listOfSourceOfEarning;

    @NotNull
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
