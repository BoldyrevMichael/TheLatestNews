package ru.ma.boldyrev.spring2.thelatestnews.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ma.boldyrev.spring2.thelatestnews.entity.CategoryOfSourceOfEarning;

@Repository
public interface CategoryOfSourceOfEarningRepository extends JpaRepository<CategoryOfSourceOfEarning, String> {

    CategoryOfSourceOfEarning getCategoryOfSourceOfEarningByName(String CategoryOfSourceOfEarningName);
}
