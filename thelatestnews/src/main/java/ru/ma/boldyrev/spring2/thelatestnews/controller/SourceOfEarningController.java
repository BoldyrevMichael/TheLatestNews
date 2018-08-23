package ru.ma.boldyrev.spring2.thelatestnews.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.ma.boldyrev.spring2.thelatestnews.entity.CategoryOfSourceOfEarning;
import ru.ma.boldyrev.spring2.thelatestnews.entity.SourceOfEarning;
import ru.ma.boldyrev.spring2.thelatestnews.service.CategoryOfSourceOfEarningService;
import ru.ma.boldyrev.spring2.thelatestnews.service.SourceOfEarningService;

import java.util.List;

@RestController
@RequestMapping(name = "/source-of-earning")
public class SourceOfEarningController {

    @Autowired
    private SourceOfEarningService sourceOfEarningService;

    @Autowired
    private CategoryOfSourceOfEarningService categoryOfSourceOfEarningService;

    @RequestMapping(value = "/create-source-of-earning")
    public void createSourceOfEarning(
            @RequestParam(value = "sourceOfEarningName") String sourceOfEarningName,
            @RequestParam(value = "sourceOfEarningPrice") String sourceOfEarningPrice,
            @RequestParam(value = "categoryOfSourceOfEarningName") String categoryOfSourceOfEarningName
    ) {
        CategoryOfSourceOfEarning categoryOfSourceOfEarning = categoryOfSourceOfEarningService
                .createCategoryOfSourceOfEarning(categoryOfSourceOfEarningName);
        sourceOfEarningService.createSourceOfEarning(
                sourceOfEarningName,
                sourceOfEarningPrice,
                categoryOfSourceOfEarning
        );
    }

    @RequestMapping(value = "/remove-source-of-earning")
    public void removeSourceOfEarning(@RequestParam(value = "sourceOfEarningId")String sourceOfEarningId) {
        sourceOfEarningService.deleteById(sourceOfEarningId);
    }

    @RequestMapping(name = "/get-list-of-source-of-earning", produces = "application/json")
    public List<SourceOfEarning> getListOfSourceOfEarning() {
        return sourceOfEarningService.getListOfSourceOfEarning();
    }
}