package ru.ma.boldyrev.spring2.thelatestnewscloudhealthcheckerclient.integration;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.handler.annotation.Header;
import ru.ma.boldyrev.spring2.thelatestnewscloudhealthcheckerclient.dto.SimpleMessage;

import java.util.logging.Logger;

@MessageEndpoint
public class SimpleMessageListener {

    private static final Logger LOGGER = Logger.getLogger(SimpleMessageListener.class.getSimpleName());

//    @ServiceActivator(inputChannel = SimpleMessageGateway.CHANEL)
    public void handler(final SimpleMessage message, @Header("REQUEST_ID") final String reqId) {
//        LOGGER.info(reqId);
//        LOGGER.info("SimpleMessage: " + message.getDate());
    }
}