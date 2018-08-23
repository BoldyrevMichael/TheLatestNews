package ru.ma.boldyrev.spring2.thelatestnews.dto;

import java.util.Date;

public class DateDto {

    private Date date;

    public DateDto() {
    }

    public DateDto(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}