package ru.ma.boldyrev.spring2.thelatestnews;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@EnableAutoConfiguration//без этой аннотации ошибка
//@SpringBootApplication(exclude = JpaRepositoriesAutoConfiguration.class) - работает и без (exclude = JpaRepositoriesAutoConfiguration.class)
@SpringBootApplication
public class TheLatestNewsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TheLatestNewsApplication.class, args);
    }
}