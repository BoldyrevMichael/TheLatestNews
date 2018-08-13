package ru.ma.boldyrev.spring2.thelatestnews.service;

import org.jetbrains.annotations.NotNull;
import ru.ma.boldyrev.spring2.thelatestnews.entity.CategoryOfSourceOfEarning;

import java.util.List;

public interface CategoryOfSourceOfEarningService {

    List<CategoryOfSourceOfEarning> getListOfCategoryOfSourceOfEarning();

    CategoryOfSourceOfEarning findCategoryOfSourceOfEarningById(String categoryOfSourceOfEarningId);

    void persist(CategoryOfSourceOfEarning categoryOfSourceOfEarning);

    void deleteById(String categoryOfSourceOfEarningId);

    CategoryOfSourceOfEarning createCategoryOfSourceOfEarning(@NotNull final String categoryOfSourceOfEarningName);
}