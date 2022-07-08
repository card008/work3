package work3.work3.controller;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import work3.work3.Interface.Sink;

public class Consumer {
    @StreamListener(value = Sink.INPUT, condition = "headers['version']=='1.0'")
    public void receiveSucceed_v1(@Payload String message) {
        String msg = "StreamReceiver v1: " + message;
        System.out.println(msg);
    }
}
