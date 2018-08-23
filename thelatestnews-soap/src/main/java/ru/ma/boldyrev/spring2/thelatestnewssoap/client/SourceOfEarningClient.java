package ru.ma.boldyrev.spring2.thelatestnewssoap.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.ma.boldyrev.spring2.thelatestnewssoap.entity.SourceOfEarning;

import java.util.List;

@RequestMapping(value = "/source-of-earning")
@FeignClient(name = "thelatestnews")
public interface SourceOfEarningClient {

    @RequestMapping(value = "/create-source-of-earning")
    void createSourceOfEarning(
            @RequestParam(value = "sourceOfEarningName") String sourceOfEarningName,
            @RequestParam(value = "sourceOfEarningPrice") String sourceOfEarningPrice,
            @RequestParam(value = "categoryOfSourceOfEarningName") String categoryOfSourceOfEarningName
    );

    @RequestMapping(value = "/remove-source-of-earning")
    void removeSourceOfEarning(@RequestParam(value = "sourceOfEarningId") String sourceOfEarningId);

    @RequestMapping(name = "/get-list-of-source-of-earning", produces = "application/json")
    List<SourceOfEarning> getListOfSourceOfEarning();
}