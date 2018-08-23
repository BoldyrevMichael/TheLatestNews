package ru.ma.boldyrev.spring2.thelatestnews;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.ma.boldyrev.spring2.thelatestnews.entity.Category;

import java.io.IOException;

import static org.assertj.core.api.Java6Assertions.assertThat;

@JsonTest
@RunWith(SpringJUnit4ClassRunner.class)
public class CategoryJsonTest {

    @Autowired(required = false)
    private JacksonTester<Category> json;

    @Test
    public void toJsonTest() throws IOException {
        Category category = new Category("category1");
        assertThat(json.write(category))
                .extractingJsonPathStringValue("@.name")
                .isEqualTo("category1");
    }
}