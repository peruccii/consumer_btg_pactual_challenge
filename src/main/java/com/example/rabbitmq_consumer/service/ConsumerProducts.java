package com.example.rabbitmq_consumer.service;

import com.example.rabbitmq_consumer.entity.Request;
import com.example.rabbitmq_consumer.repository.RequestRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerProducts {

    private final RequestRepository requestRepository;

    public ConsumerProducts(RequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }

    @RabbitListener(queues = "REQUESTS")
    public void consumer(Request request) {
        System.out.println(request);
//        requestRepository.save(request);
    }
}
