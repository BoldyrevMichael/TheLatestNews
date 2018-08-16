package ru.ma.boldyrev.spring2.thelatestnewscloudhealthcheckerclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class TheLatestNewsCloudHealthCheckerClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(TheLatestNewsCloudHealthCheckerClientApplication.class, args);
    }
}
