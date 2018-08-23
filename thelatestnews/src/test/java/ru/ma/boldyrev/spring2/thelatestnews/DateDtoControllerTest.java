package ru.ma.boldyrev.spring2.thelatestnews;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.ma.boldyrev.spring2.thelatestnews.dto.DateDto;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DateDtoControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void test() {
        ResponseEntity<DateDto> entity =
                testRestTemplate.getForEntity("/try-test-controller/date", DateDto.class);
        assertTrue(entity.getStatusCode() == HttpStatus.OK);
        DateDto dateDto = entity.getBody();
        assertNotNull(dateDto);
        assertNotNull(dateDto.getDate());
    }
}