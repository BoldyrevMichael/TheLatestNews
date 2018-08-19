package ru.ma.boldyrev.spring2.thelatestnewscloudhealthcheckerclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ru.ma.boldyrev.spring2.thelatestnewscloudhealthcheckerclient.client.InteractionClient;
import ru.ma.boldyrev.spring2.thelatestnewscloudhealthcheckerclient.dto.PingDto;
import ru.ma.boldyrev.spring2.thelatestnewscloudhealthcheckerclient.dto.ResultOfSumDto;

@RestController
@RequestMapping("/cloud-health-checker-client/interact")
public class InteractionController {

    @Autowired(required = false)
    private InteractionClient interactionClient;

    @RequestMapping(value = "/pingJSON", produces = "application/json")
    public PingDto pingJson() {
        return new PingDto();//здесь работаем внутри приложения
    }

    @RequestMapping(value = "/pingXML", produces = "application/xml")
    public PingDto pingXml() {
        return new PingDto();//здесь работаем внутри приложения
    }

    @RequestMapping(value = "/sum-of", produces = "application/xml")
    public ResultOfSumDto getSum(
            @RequestParam(value = "a") final Double a,
            @RequestParam(value = "b") final Double b
    ) {
        return interactionClient.getSum(a, b);//здесь используем другое приложение через интерфейс
    }
}