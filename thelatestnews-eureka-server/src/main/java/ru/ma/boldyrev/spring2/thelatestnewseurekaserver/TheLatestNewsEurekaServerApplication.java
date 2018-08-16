package ru.ma.boldyrev.spring2.thelatestnewseurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class TheLatestNewsEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TheLatestNewsEurekaServerApplication.class, args);
    }
}
