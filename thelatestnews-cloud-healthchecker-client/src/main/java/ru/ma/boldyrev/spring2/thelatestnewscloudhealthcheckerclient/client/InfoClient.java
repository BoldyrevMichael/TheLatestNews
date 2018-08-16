package ru.ma.boldyrev.spring2.thelatestnewscloudhealthcheckerclient.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.ma.boldyrev.spring2.thelatestnewscloudhealthcheckerclient.dto.PingDto;

@RequestMapping(value = "/cloud-health-checker/info")
@FeignClient(name = "thelatestnews-cloud-healthchecker")
public interface InfoClient {

    @RequestMapping(value = "/ping", produces = "application/json")
    PingDto ping();

    @RequestMapping(value = "/name", produces = "application/json")
    String getDeveloperName();
}
