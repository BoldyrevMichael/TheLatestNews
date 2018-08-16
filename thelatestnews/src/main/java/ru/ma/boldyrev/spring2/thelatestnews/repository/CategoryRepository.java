package ru.ma.boldyrev.spring2.thelatestnews.repository;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import ru.ma.boldyrev.spring2.thelatestnews.entity.Category;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

@Repository
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class CategoryRepository {

    private Map<String, Category> listOfCategory = new LinkedHashMap<>();

    @PostConstruct
    private void init() {
        merge(new Category("Category1"));
        merge(new Category("Category2"));
        merge(new Category("Category3"));
    }

    public Collection<Category> getListOfCategory() {
        return listOfCategory.values();
    }

    public void merge(Category category) {
        if (category == null) return;
        if (category.getId() == null || category.getId().isEmpty()) return;
        listOfCategory.put(category.getId(), category);
    }

    public Category findOne(String categoryId) {
        if (categoryId == null || categoryId.isEmpty()) return null;
        return listOfCategory.get(categoryId);
    }

    public void removeCategoryById(String categoryId) {
        if (categoryId == null || categoryId.isEmpty()) return;
        listOfCategory.remove(categoryId);
    }
}
