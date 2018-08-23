package ru.ma.boldyrev.spring2.thelatestnewscloudhealthchecker.integration;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.messaging.Message;
import ru.ma.boldyrev.spring2.thelatestnewscloudhealthchecker.dto.SimpleMessage;

@MessagingGateway(name = SimpleTextMessageGateway.GATEWAY, defaultRequestChannel = SimpleTextMessageGateway.CHANEL)
public interface SimpleTextMessageGateway {

    String CHANEL = "simpleTextMessageChannel";

    String GATEWAY = "simpleTextMessageGateway";

    @Gateway
    void fire(Message<SimpleMessage> message);
}