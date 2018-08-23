package ru.ma.boldyrev.spring2.thelatestnews.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ma.boldyrev.spring2.thelatestnews.dto.DateDto;

import java.util.Date;

@RestController
@RequestMapping(value = "/try-test-controller")
public class DateDtoController {

    @RequestMapping(value = "/date", produces = "application/json")
    public DateDto getDateDto() {
        return new DateDto(new Date());
    }
}
