package ru.ma.boldyrev.spring2.thelatestnews.repository;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import ru.ma.boldyrev.spring2.thelatestnews.entity.Article;
import ru.ma.boldyrev.spring2.thelatestnews.entity.Category;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

@Repository
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class ArticleRepository {

    private Map<String, Article> listOfArticle = new LinkedHashMap<>();

    @PostConstruct
    private void init() {
        Category category1 = new Category("Category1");
        Category category2 = new Category("Category2");
        Category category3 = new Category("Category3");
        merge(new Article("Article1", "Content of article1", category1));
        merge(new Article("Article2", "Content of article2", category1));
        merge(new Article("Article3", "Content of article3", category2));
        merge(new Article("Article4", "Content of article4", category2));
        merge(new Article("Article5", "Content of article5", category3));
        merge(new Article("Article6", "Content of article6", category3));
    }

    public Collection<Article> getListOfArticle() {
        return listOfArticle.values();
    }

    public void merge(Article article) {
        if (article == null) return;
        if (article.getId() == null || article.getId().isEmpty()) return;
        listOfArticle.put(article.getId(), article);
    }

    public Article findOne(String articleId) {
        if (articleId == null || articleId.isEmpty()) return null;
        return listOfArticle.get(articleId);
    }

    public void removeArticleById(String articleId) {
        if (articleId == null || articleId.isEmpty()) return;
        listOfArticle.remove(articleId);
    }
}
