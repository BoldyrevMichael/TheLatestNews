package ru.ma.boldyrev.spring2.thelatestnews.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.ma.boldyrev.spring2.thelatestnews.entity.SourceOfEarning;

import java.util.Date;
import java.util.List;

@Repository
@Transactional
public interface SourceOfEarningRepository extends JpaRepository<SourceOfEarning, String> {

/*    List<SourceOfEarning> getAllByCategoryOfSourceOfEarningId(String categoryOfSourceOfEarningId);

    List<SourceOfEarning> getAllByExecutionDate(Date executionDataOfSourceOfEarningId);*/
}




