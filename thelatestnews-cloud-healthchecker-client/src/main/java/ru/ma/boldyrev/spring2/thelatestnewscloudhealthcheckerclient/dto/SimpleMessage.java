package ru.ma.boldyrev.spring2.thelatestnewscloudhealthcheckerclient.dto;

import java.util.Date;

public class SimpleMessage {

    private Date date = new Date();

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}