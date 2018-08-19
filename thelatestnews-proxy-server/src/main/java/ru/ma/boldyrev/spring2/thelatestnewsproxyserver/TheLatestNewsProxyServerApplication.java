package ru.ma.boldyrev.spring2.thelatestnewsproxyserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class TheLatestNewsProxyServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TheLatestNewsProxyServerApplication.class, args);
    }
}
