package ru.ma.boldyrev.spring2.thelatestnewscloudhealthcheckerclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.ma.boldyrev.spring2.thelatestnewscloudhealthcheckerclient.client.InfoClient;
import ru.ma.boldyrev.spring2.thelatestnewscloudhealthcheckerclient.dto.PingDto;

@RefreshScope
@RestController
@RequestMapping("/cloud-health-checker-client/info")
public class InfoController {

    @Autowired(required = false)
    private InfoClient infoClient;

    @Value("${info.developer.name}")
    private String developerName;

    @RequestMapping(value = "/pingJSON", produces = "application/json")
    public PingDto pingJson() {
        return infoClient.ping();//здесь используем другое приложение через интерфейс
    }

    @RequestMapping(value = "/pingXML", produces = "application/xml")
    public PingDto pingXml() {
        return infoClient.ping();//здесь используем другое приложение через интерфейс
    }

    @RequestMapping(value = "/name", method = RequestMethod.GET)
    public String getDeveloperName() {
        return developerName;//здесь работаем внутри приложения, но имя берётся через thelatestnews-server-config
    }
}
