package ru.boldyrev.ma.spring2.thelatestnews.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.boldyrev.ma.spring2.thelatestnews.repository.ArticleRepository;
import ru.boldyrev.ma.spring2.thelatestnews.repository.CategoryRepository;

import java.util.Map;

@Controller
public class HomePageController {

    @Autowired
    private ArticleRepository articleRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("listOfCategory", categoryRepository.getListOfCategory());
        model.put("listOfArticle", articleRepository.getListOfArticle());
        return "home-page";
    }
}
