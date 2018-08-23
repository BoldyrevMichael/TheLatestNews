package ru.ma.boldyrev.spring2.thelatestnewscloudhealthchecker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.ma.boldyrev.spring2.thelatestnewscloudhealthchecker.dto.PingDto;
import ru.ma.boldyrev.spring2.thelatestnewscloudhealthchecker.dto.SimpleMessage;
import ru.ma.boldyrev.spring2.thelatestnewscloudhealthchecker.dto.WelcomeMessage;
import ru.ma.boldyrev.spring2.thelatestnewscloudhealthchecker.integration.SimpleMessageGateway;
import ru.ma.boldyrev.spring2.thelatestnewscloudhealthchecker.integration.SimpleTextMessageGateway;
import ru.ma.boldyrev.spring2.thelatestnewscloudhealthchecker.integration.WelcomeMessageGateway;

import java.util.UUID;

@RestController
@RequestMapping("/cloud-health-checker/integration")
public class IntegrationController {

    @Autowired
    private SimpleMessageGateway simpleMessageGateway;

    @Autowired
    private WelcomeMessageGateway welcomeMessageGateway;

    @Autowired
    private SimpleTextMessageGateway simpleTextMessageGateway;

    @RequestMapping(value = "/ping", produces = "application/json")
    public PingDto ping() {
        return new PingDto();
    }

    @RequestMapping(value = "/simple", method = RequestMethod.GET, produces = "application/json")
    public PingDto send() {
        simpleMessageGateway.fire(MessageBuilder
                .withPayload(new SimpleMessage())
                .setHeader("REQUEST_ID", UUID.randomUUID().toString())
                .build());
        return new PingDto();
    }

    @RequestMapping(value = "/simple-text", method = RequestMethod.GET, produces = "application/json")
    public PingDto sendText() {
        simpleTextMessageGateway.fire(MessageBuilder
                .withPayload(new SimpleMessage())
                .setHeader("REQUEST_ID", UUID.randomUUID().toString())
                .build());
        return new PingDto();
    }

    @RequestMapping(value = "/welcome", method = RequestMethod.GET, produces = "application/json")
    public PingDto welcome(@RequestParam(name = "name") String name) {
        welcomeMessageGateway.fire(MessageBuilder.withPayload(new WelcomeMessage(name)).build());
        return new PingDto();
    }
}
