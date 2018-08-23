package ru.ma.boldyrev.spring2.thelatestnewscloudhealthchecker.integration;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.Transformer;
import ru.ma.boldyrev.spring2.thelatestnewscloudhealthchecker.dto.SimpleMessage;
import ru.ma.boldyrev.spring2.thelatestnewscloudhealthchecker.dto.TextMessage;

@MessageEndpoint
public class SimpleTextMessageTransformer {

    @Transformer(inputChannel = SimpleTextMessageGateway.CHANEL, outputChannel = TextMessageGateway.CHANEL)
    public TextMessage transform(SimpleMessage simpleMessage) {
        System.out.println("SimpleTextMessageTransformer");
        return new TextMessage(simpleMessage.getDate().toString());
    }
}
