package ru.ma.boldyrev.spring2.thelatestnewscloudhealthchecker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TheLatestNewsCloudHealthCheckerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TheLatestNewsCloudHealthCheckerApplication.class, args);
    }
}
