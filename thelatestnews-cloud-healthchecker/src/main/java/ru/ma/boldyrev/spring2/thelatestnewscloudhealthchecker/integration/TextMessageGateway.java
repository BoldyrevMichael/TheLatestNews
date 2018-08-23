package ru.ma.boldyrev.spring2.thelatestnewscloudhealthchecker.integration;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.messaging.Message;
import ru.ma.boldyrev.spring2.thelatestnewscloudhealthchecker.dto.TextMessage;

@MessagingGateway(name = TextMessageGateway.GATEWAY, defaultRequestChannel = TextMessageGateway.CHANEL)
public interface TextMessageGateway {

    String CHANEL = "textMessageChannel";

    String GATEWAY = "textMessageGateway";

    @Gateway
    void fire(Message<TextMessage> message);

}
