package com.grupo3.productor.rabbitmq;

import com.grupo3.productor.config.RabbitMQConfig;
import com.grupo3.productor.dto.FibonacciRequest;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class FibonacciProductor {

    private final RabbitTemplate rabbitTemplate;

    public FibonacciProductor(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void enviarNumerosARabbitMQ(FibonacciRequest request) {
        rabbitTemplate.convertAndSend(
                RabbitMQConfig.EXCHANGE,
                RabbitMQConfig.ROUTING_KEY,
                request
        );
    }
}
