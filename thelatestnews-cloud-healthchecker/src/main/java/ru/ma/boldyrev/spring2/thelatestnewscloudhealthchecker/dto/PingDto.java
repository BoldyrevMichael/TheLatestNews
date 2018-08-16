package ru.ma.boldyrev.spring2.thelatestnewscloudhealthchecker.dto;

public class PingDto {

    Boolean success = true;

    public PingDto() {
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}