package ru.ma.boldyrev.spring2.thelatestnewscloudhealthcheckerclient.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
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