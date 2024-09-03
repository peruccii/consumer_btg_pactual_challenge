package com.example.rabbitmq_consumer.repository;

import com.example.rabbitmq_consumer.entity.Request;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository extends JpaRepository<Request,Long> {
}
