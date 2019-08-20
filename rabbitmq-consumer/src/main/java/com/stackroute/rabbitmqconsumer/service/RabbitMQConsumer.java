package com.stackroute.rabbitmqconsumer.service;

import com.stackroute.rabbitmqconsumer.domain.Employee;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConsumer
{

    @RabbitListener(queues = "${jsa.rabbitmq.queue}")
    public void recievedMessage(Employee employee) {
        System.out.println("Recieved Message From RabbitMQ: " + employee);
    }
}
