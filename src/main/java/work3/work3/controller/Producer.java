package work3.work3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import work3.work3.Interface.Source;

public class Producer {
    @Autowired
    private Source source;

    @GetMapping("/")
    public void sendSucceed() {
        source.message().send(MessageBuilder.withPayload("Hello World...")
                .setHeader("routingKey", "login.user.succeed")
                .setHeader("version", "1.0")
                .setHeader("x-delay", 5000)
                .build());
    }


}
