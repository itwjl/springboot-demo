package com.dicfin.springbootdemo.mq;

import com.dicfin.springbootdemo.entity.Message;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Slf4j
public class KafkaSender {

    private final KafkaTemplate<String, String> kafkaTemplate;

    //构造器方式注入  kafkaTemplate
    public KafkaSender(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    private Gson gson = new GsonBuilder().create();

    public void send(String msg) {
        Message message = new Message();

        message.setId(String.valueOf(System.currentTimeMillis()));
        message.setMsg(msg);
        message.setSendTime(new Date());
        log.info("【++++++++++++++++++ message ：{}】", gson.toJson(message));
        //对 topic =  hello2 的发送消息
        kafkaTemplate.send("hello2",gson.toJson(message));
    }

}