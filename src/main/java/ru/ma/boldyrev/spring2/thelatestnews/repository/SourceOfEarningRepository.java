package ru.ma.boldyrev.spring2.thelatestnews.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ma.boldyrev.spring2.thelatestnews.entity.SourceOfEarning;

import java.util.Date;
import java.util.List;

@Repository
public interface SourceOfEarningRepository extends JpaRepository<SourceOfEarning, String> {

    List<SourceOfEarning> getListOfSourceOfEarningByCategoryOfSourceOfEarningId(String categoryOfSourceOfEarningId);

    List<SourceOfEarning> getListOfSourceOfEarningByExecutionDate(Date executionDataOfSourceOfEarningId);
}
