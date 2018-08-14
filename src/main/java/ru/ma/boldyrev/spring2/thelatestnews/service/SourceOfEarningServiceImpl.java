package ru.ma.boldyrev.spring2.thelatestnews.service;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.ma.boldyrev.spring2.thelatestnews.entity.CategoryOfSourceOfEarning;
import ru.ma.boldyrev.spring2.thelatestnews.entity.SourceOfEarning;
import ru.ma.boldyrev.spring2.thelatestnews.repository.SourceOfEarningRepository;

import java.util.Date;
import java.util.List;

@Service
public class SourceOfEarningServiceImpl implements SourceOfEarningService {

    @Autowired
    private SourceOfEarningRepository sourceOfEarningRepository;

    @Override
    @Transactional(readOnly = true)
    public List<SourceOfEarning> getListOfSourceOfEarning() {
        return sourceOfEarningRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public SourceOfEarning findSourceOfEarningById(String sourceOfEarningId) {
        return sourceOfEarningRepository.getOne(sourceOfEarningId);
    }

    @Override
    @Transactional(readOnly = true)
    public List<SourceOfEarning> getListOfSourceOfEarningByCategoryOfSourceOfEarningId(String categoryOfSourceOfEarningId) {
        return sourceOfEarningRepository.getListOfSourceOfEarningByCategoryOfSourceOfEarningId(categoryOfSourceOfEarningId);
    }

    @Override
    @Transactional(readOnly = true)
    public List<SourceOfEarning> getListOfSourceOfEarningByExecutionDate(Date executionDataOfSourceOfEarningId) {
        return sourceOfEarningRepository.getListOfSourceOfEarningByExecutionDate(executionDataOfSourceOfEarningId);
    }

    @Override
    @Transactional
    public void persist(SourceOfEarning sourceOfEarning) {
        sourceOfEarningRepository.save(sourceOfEarning);
    }

    @Override
    @Transactional
    public void deleteById(String sourceOfEarningId) {
        sourceOfEarningRepository.deleteById(sourceOfEarningId);
    }

    @Override
    @Transactional
    public SourceOfEarning createSourceOfEarning(
            @NotNull final String name,
            @NotNull final String price,
            @NotNull final CategoryOfSourceOfEarning categoryOfSourceOfEarning
    ) {
        final SourceOfEarning sourceOfEarning = new SourceOfEarning();
        sourceOfEarning.setName(name);
        sourceOfEarning.setName(price);
        sourceOfEarning.setCategoryOfSourceOfEarning(categoryOfSourceOfEarning);
        sourceOfEarningRepository.save(sourceOfEarning);
        return sourceOfEarning;
    }
}
