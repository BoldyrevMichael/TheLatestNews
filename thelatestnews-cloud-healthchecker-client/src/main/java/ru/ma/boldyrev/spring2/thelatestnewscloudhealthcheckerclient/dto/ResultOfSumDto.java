package ru.ma.boldyrev.spring2.thelatestnewscloudhealthcheckerclient.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ResultOfSumDto {

    Double resultOfSum;

    public ResultOfSumDto() {
    }

    public ResultOfSumDto(Double resultOfSum) {
        this.resultOfSum = resultOfSum;
    }

    public Double getResultOfSum() {
        return resultOfSum;
    }

    public void setResultOfSum(Double resultOfSum) {
        this.resultOfSum = resultOfSum;
    }
}
