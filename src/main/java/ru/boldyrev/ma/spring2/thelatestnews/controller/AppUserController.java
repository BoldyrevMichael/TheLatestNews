package ru.boldyrev.ma.spring2.thelatestnews.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.boldyrev.ma.spring2.thelatestnews.model.AppUser;
import ru.boldyrev.ma.spring2.thelatestnews.repository.AppUserRepository;

import java.util.Map;

@Controller
public class AppUserController {

    @Autowired
    AppUserRepository appUserRepository;

    @RequestMapping(value = {"/registration"}, method = RequestMethod.GET)
    public String appUserCreate(Map<String, Object> model) {
        AppUser appUser = new AppUser();
        model.put("appUser", appUser);
        return "/registration";
    }

    @RequestMapping(value = {"/registration"}, method = RequestMethod.POST)
    public String appUserSaveAfteCreate(@ModelAttribute("appUser") AppUser appUser) {
        appUserRepository.merge(appUser);
        return "redirect:/home-page";
    }
}