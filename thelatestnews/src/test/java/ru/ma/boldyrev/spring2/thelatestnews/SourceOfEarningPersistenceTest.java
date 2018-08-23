package ru.ma.boldyrev.spring2.thelatestnews;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ru.ma.boldyrev.spring2.thelatestnews.entity.SourceOfEarning;

@DataJpaTest
@RunWith(SpringJUnit4ClassRunner.class)
public class SourceOfEarningPersistenceTest {

    @Autowired
    private TestEntityManager testEntityManager;

    @Test
    public void test() {
        testEntityManager.getEntityManager().createQuery("DELETE FROM SourceOfEarning").executeUpdate();
        Assert.assertEquals(getCountSourceOfEarning(), 0L);
        testEntityManager.persist(new SourceOfEarning());
        Assert.assertEquals(getCountSourceOfEarning(), 1L);
        testEntityManager.getEntityManager().createQuery("DELETE FROM SourceOfEarning").executeUpdate();
        Assert.assertEquals(getCountSourceOfEarning(), 0L);
    }

    public long getCountSourceOfEarning() {
        return testEntityManager.getEntityManager().createQuery("SELECT COUNT(e) FROM SourceOfEarning e", Long.class)
                .getSingleResult();
    }
}
