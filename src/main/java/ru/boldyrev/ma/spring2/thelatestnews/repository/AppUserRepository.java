package ru.boldyrev.ma.spring2.thelatestnews.repository;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import ru.boldyrev.ma.spring2.thelatestnews.model.AppUser;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

@Repository
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class AppUserRepository {

    private Map<String, AppUser> listOfAppUser = new LinkedHashMap<>();

    @PostConstruct
    private void init() {
        merge(new AppUser("Иван", "Иванов", "login1", "password1", "email1"));
        merge(new AppUser("Пётр", "Петров", "login2", "password2", "email2"));
        merge(new AppUser("Александр", "Александров", "login3", "password3", "email3"));
    }

    public Collection<AppUser> getListOfAppUser() {
        return listOfAppUser.values();
    }

    public void merge(AppUser appUser) {
        if (appUser == null) return;
        if (appUser.getId() == null || appUser.getId().isEmpty()) return;
        listOfAppUser.put(appUser.getId(), appUser);
    }

    public AppUser findOne(String appUserId) {
        if (appUserId == null || appUserId.isEmpty()) return null;
        return listOfAppUser.get(appUserId);
    }

    public void removeAppUserById(String appUserId) {
        if (appUserId == null || appUserId.isEmpty()) return;
        listOfAppUser.remove(appUserId);
    }
}
