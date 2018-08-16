package ru.ma.boldyrev.spring2.thelatestnewscloudhealthchecker.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.ma.boldyrev.spring2.thelatestnewscloudhealthchecker.dto.PingDto;
import ru.ma.boldyrev.spring2.thelatestnewscloudhealthchecker.dto.ResultOfSumDto;

@RestController
@RequestMapping("/cloud-health-checker/interact")
public class InteractionController {

    @RequestMapping(value = "/ping", produces = "application/json")
    public PingDto ping() {
        return new PingDto();
    }

    @RequestMapping(value = "/sum-of", produces = "application/json")
    public ResultOfSumDto getSum(
            @RequestParam(value = "a") final Double a,
            @RequestParam(value = "b") final Double b
    ) {
        return new ResultOfSumDto(a + b);
    }
}