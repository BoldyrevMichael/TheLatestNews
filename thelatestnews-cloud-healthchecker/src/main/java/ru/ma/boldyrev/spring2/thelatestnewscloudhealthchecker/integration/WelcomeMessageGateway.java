package ru.ma.boldyrev.spring2.thelatestnewscloudhealthchecker.integration;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.messaging.Message;
import ru.ma.boldyrev.spring2.thelatestnewscloudhealthchecker.dto.WelcomeMessage;

@MessagingGateway(name = WelcomeMessageGateway.GATEWAY, defaultRequestChannel = WelcomeMessageGateway.CHANEL)
public interface WelcomeMessageGateway {

    String CHANEL = "welcomeChannel";

    String GATEWAY = "welcomeGateway";

    @Gateway
    void fire(Message<WelcomeMessage> message);
}
