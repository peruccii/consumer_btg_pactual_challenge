package com.example.rabbitmq_consumer.service;

import com.example.rabbitmq_consumer.entity.Request;
import com.example.rabbitmq_consumer.queue.QueuesRabbit;
import com.example.rabbitmq_consumer.repository.RequestRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RequestsConsumer {

    private final RequestRepository requestRepository;

    public RequestsConsumer(RequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }

    @RabbitListener(queues = QueuesRabbit.REQUEST_QUEUE)
    public void consumer(Request request) {
        System.out.println(request);
        // Todo: Validate `request` before save
//        requestRepository.save(request);
    }
}
