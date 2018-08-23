package ru.ma.boldyrev.spring2.thelatestnews.service;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.ma.boldyrev.spring2.thelatestnews.entity.CategoryOfSourceOfEarning;
import ru.ma.boldyrev.spring2.thelatestnews.entity.SourceOfEarning;
import ru.ma.boldyrev.spring2.thelatestnews.repository.SourceOfEarningRepository;

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

/*    @Override
    @Transactional(readOnly = true)
    public List<SourceOfEarning> getAllByCategoryOfSourceOfEarningId(String categoryOfSourceOfEarningId) {
        return sourceOfEarningRepository.getAllByCategoryOfSourceOfEarningId(categoryOfSourceOfEarningId);
    }

    @Override
    @Transactional(readOnly = true)
    public List<SourceOfEarning> getAllByExecutionDate(Date executionDataOfSourceOfEarningId) {
        return sourceOfEarningRepository.getAllByExecutionDate(executionDataOfSourceOfEarningId);
    }*/

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
