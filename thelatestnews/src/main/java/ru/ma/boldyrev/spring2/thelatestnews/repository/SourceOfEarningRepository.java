package ru.ma.boldyrev.spring2.thelatestnews.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.ma.boldyrev.spring2.thelatestnews.entity.SourceOfEarning;

@Repository
@Transactional
public interface SourceOfEarningRepository extends JpaRepository<SourceOfEarning, String> {

    SourceOfEarning findSourceOfEarningById(String sourceOfEarningId);

/*    List<SourceOfEarning> getAllByCategoryOfSourceOfEarningId(String categoryOfSourceOfEarningId);

    List<SourceOfEarning> getAllByExecutionDate(Date executionDataOfSourceOfEarningId);*/
}




