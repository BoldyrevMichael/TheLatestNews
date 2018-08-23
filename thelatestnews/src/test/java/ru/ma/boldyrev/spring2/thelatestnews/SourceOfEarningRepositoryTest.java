package ru.ma.boldyrev.spring2.thelatestnews;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.ma.boldyrev.spring2.thelatestnews.entity.SourceOfEarning;
import ru.ma.boldyrev.spring2.thelatestnews.repository.SourceOfEarningRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TheLatestNewsApplication.class})
public class SourceOfEarningRepositoryTest {

    @Autowired
    private SourceOfEarningRepository sourceOfEarningRepository;

    @Test
    public void testFindById() {
        Assert.assertEquals(sourceOfEarningRepository.count(), 0L);
        Assert.assertNull(sourceOfEarningRepository.findSourceOfEarningById("wrongId"));
        SourceOfEarning sourceOfEarning = new SourceOfEarning();
        String id = sourceOfEarning.getId();
        sourceOfEarningRepository.save(sourceOfEarning);
        Assert.assertEquals(sourceOfEarningRepository.count(), 1);
        Assert.assertNotNull(sourceOfEarningRepository.findById(id));
        sourceOfEarningRepository.delete(sourceOfEarning);
    }

    @Test
    public void testDeleteAll() {
        sourceOfEarningRepository.deleteAll();
        Assert.assertTrue(sourceOfEarningRepository.findAll().isEmpty());
        sourceOfEarningRepository.save(new SourceOfEarning());
        Assert.assertFalse(sourceOfEarningRepository.findAll().isEmpty());
        sourceOfEarningRepository.deleteAll();
        Assert.assertTrue(sourceOfEarningRepository.findAll().isEmpty());
    }
}
