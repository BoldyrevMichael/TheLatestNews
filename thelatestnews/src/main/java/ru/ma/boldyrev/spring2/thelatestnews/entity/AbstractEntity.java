package ru.ma.boldyrev.spring2.thelatestnews.entity;

import org.jetbrains.annotations.NotNull;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.UUID;

@MappedSuperclass
public class AbstractEntity {

    @NotNull
    public static final String PREFIX = "app_";

    @Id
    @NotNull
    private String id = UUID.randomUUID().toString();

    @NotNull
    public String getId() {
        return id;
    }

    public void setId(@NotNull String id) {
        this.id = id;
    }
}
