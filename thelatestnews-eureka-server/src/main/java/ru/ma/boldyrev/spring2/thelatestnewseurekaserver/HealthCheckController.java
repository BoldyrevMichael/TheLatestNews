package ru.ma.boldyrev.spring2.thelatestnewseurekaserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class HealthCheckController {

    @Value("${developer.email}")
    private String email;

    @RequestMapping(value = "/check-health")
    public String checkHealth() {
        return email;
    }
}
