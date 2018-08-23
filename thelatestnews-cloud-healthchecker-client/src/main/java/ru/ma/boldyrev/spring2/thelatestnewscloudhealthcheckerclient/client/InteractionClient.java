package ru.ma.boldyrev.spring2.thelatestnewscloudhealthcheckerclient.client;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.ma.boldyrev.spring2.thelatestnewscloudhealthcheckerclient.dto.PingDto;
import ru.ma.boldyrev.spring2.thelatestnewscloudhealthcheckerclient.dto.ResultOfSumDto;

@RefreshScope
@RequestMapping(value = "/cloud-health-checker/interact")
@FeignClient(name = "thelatestnews-cloud-healthchecker")
public interface InteractionClient {

    @RequestMapping(value = "/ping", produces = "application/json")
    PingDto ping();

    @RequestMapping(value = "/sum-of", produces = "application/json")
    ResultOfSumDto getSum(
            @RequestParam(value = "a") final Double a,
            @RequestParam(value = "b") final Double b
    );
}