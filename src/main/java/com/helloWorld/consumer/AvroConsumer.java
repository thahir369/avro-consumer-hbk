package com.helloWorld.consumer;

import lombok.RequiredArgsConstructor;
import org.apache.avro.specific.SpecificRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class AvroConsumer {

    final String topicName="avro-thahir";


    @KafkaListener(groupId = "avro-thahir-grp",topics =topicName,containerFactory = "kafkaListenerContainerFactory")
    public void getEventData(@Payload final SpecificRecord eventdata, final Acknowledgment acknowledgment){

        System.out.println(eventdata);
    }

}
