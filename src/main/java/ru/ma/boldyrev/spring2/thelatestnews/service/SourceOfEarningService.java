package ru.ma.boldyrev.spring2.thelatestnews.service;

import org.jetbrains.annotations.NotNull;
import ru.ma.boldyrev.spring2.thelatestnews.entity.CategoryOfSourceOfEarning;
import ru.ma.boldyrev.spring2.thelatestnews.entity.SourceOfEarning;

import java.util.Date;
import java.util.List;

public interface SourceOfEarningService {

    List<SourceOfEarning> getListOfSourceOfEarning();

    SourceOfEarning findSourceOfEarningById(String sourceOfEarningId);

/*    List<SourceOfEarning> getAllByCategoryOfSourceOfEarningId(String categoryOfSourceOfEarningId);

    List<SourceOfEarning> getAllByExecutionDate(Date executionDataOfSourceOfEarningId);*/

    void persist(SourceOfEarning sourceOfEarning);

    void deleteById(String sourceOfEarningId);

    SourceOfEarning createSourceOfEarning(
            @NotNull final String name,
            @NotNull final String price,
            @NotNull final CategoryOfSourceOfEarning categoryOfSourceOfEarning
    );
}