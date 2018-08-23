package ru.ma.boldyrev.spring2.thelatestnewscloudhealthchecker.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.messaging.MessageChannel;

@EnableAutoConfiguration
@EnableIntegration
@IntegrationComponentScan("ru.ma.boldyrev.spring2.thelatestnewscloudhealthchecker.integration")
public class TheLatestNewsCloudHealthCheckerApplicationConfig {

    @Bean
    public MessageChannel simpleMessageChannel() {
        return new DirectChannel();
    }

    @Bean
    public MessageChannel simpleTextMessageChannel() {
        return new DirectChannel();
    }

    @Bean
    public MessageChannel simpleMessageTransformChannel() {
        return new DirectChannel();
    }

    @Bean
    public MessageChannel textMessageChannel() {
        return new DirectChannel();
    }

    @Bean
    public MessageChannel welcomeNullableChannel() {
        return new DirectChannel();
    }

    @Bean
    public MessageChannel welcomeNotNullChannel() {
        return new DirectChannel();
    }

    @Bean
    public MessageChannel welcomeChannel() {
        return new DirectChannel();
    }
}
