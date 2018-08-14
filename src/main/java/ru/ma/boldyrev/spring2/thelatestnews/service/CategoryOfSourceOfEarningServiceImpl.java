package ru.ma.boldyrev.spring2.thelatestnews.service;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.ma.boldyrev.spring2.thelatestnews.entity.CategoryOfSourceOfEarning;
import ru.ma.boldyrev.spring2.thelatestnews.repository.CategoryOfSourceOfEarningRepository;

import java.util.List;

@Service
public class CategoryOfSourceOfEarningServiceImpl implements CategoryOfSourceOfEarningService {

    @Autowired
    private CategoryOfSourceOfEarningRepository categoryOfSourceOfEarningRepository;

    @Override
    @Transactional(readOnly = true)
    public List<CategoryOfSourceOfEarning> getListOfCategoryOfSourceOfEarning() {
        return categoryOfSourceOfEarningRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public CategoryOfSourceOfEarning findCategoryOfSourceOfEarningById(String categoryOfSourceOfEarningId) {
        return categoryOfSourceOfEarningRepository.getOne(categoryOfSourceOfEarningId);
    }

    @Override
    @Transactional
    public void persist(CategoryOfSourceOfEarning categoryOfSourceOfEarning) {
        categoryOfSourceOfEarningRepository.save(categoryOfSourceOfEarning);
    }

    @Override
    @Transactional
    public void deleteById(String categoryOfSourceOfEarningId) {
        categoryOfSourceOfEarningRepository.deleteById(categoryOfSourceOfEarningId);
    }

    @Override
    @Transactional
    public CategoryOfSourceOfEarning createCategoryOfSourceOfEarning(@NotNull final String categoryOfSourceOfEarningName) {
        CategoryOfSourceOfEarning categoryOfSourceOfEarning = categoryOfSourceOfEarningRepository.getCategoryOfSourceOfEarningByName(categoryOfSourceOfEarningName);
        if (categoryOfSourceOfEarning != null) return categoryOfSourceOfEarning;
        else {
            categoryOfSourceOfEarning = new CategoryOfSourceOfEarning();
            categoryOfSourceOfEarning.setName(categoryOfSourceOfEarningName);
            categoryOfSourceOfEarningRepository.save(categoryOfSourceOfEarning);
            return categoryOfSourceOfEarning;
        }
    }
}
