package ru.ma.boldyrev.spring2.thelatestnewscloudhealthchecker.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.ma.boldyrev.spring2.thelatestnewscloudhealthchecker.dto.PingDto;

@RefreshScope
@RestController
@RequestMapping("/cloud-health-checker/info")
public class InfoController {

    @Value("${info.developer.name}")
    private String developerName;

    @RequestMapping(value = "/ping", produces = "application/json")
    public PingDto ping() {
        return new PingDto();
    }

    @RequestMapping(value = "/name", method = RequestMethod.GET)
    public String getDeveloperName() {
        return developerName;
    }
}
