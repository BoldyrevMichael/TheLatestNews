package ru.ma.boldyrev.spring2.thelatestnewssoap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@EnableAutoConfiguration//без этой аннотации ошибка
//@SpringBootApplication(exclude = JpaRepositoriesAutoConfiguration.class) - работает и без (exclude = JpaRepositoriesAutoConfiguration.class)
@SpringBootApplication
public class TheLatestNewsApplicationSoap {

    public static void main(String[] args) {
        SpringApplication.run(TheLatestNewsApplicationSoap.class, args);
    }
}