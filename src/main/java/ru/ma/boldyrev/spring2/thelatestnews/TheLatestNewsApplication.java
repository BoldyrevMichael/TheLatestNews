package ru.ma.boldyrev.spring2.thelatestnews;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;

@EnableAutoConfiguration
@SpringBootApplication(exclude = JpaRepositoriesAutoConfiguration.class)
public class TheLatestNewsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TheLatestNewsApplication.class, args);
    }
}
