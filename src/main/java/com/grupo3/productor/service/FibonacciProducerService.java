package com.grupo3.productor.service;

import com.grupo3.productor.dto.FibonacciRequest;
import com.grupo3.productor.rabbitmq.FibonacciProductor;
import org.springframework.stereotype.Service;

@Service
public class FibonacciProducerService {

    private final FibonacciProductor fibonacciProductor;

    public FibonacciProducerService(FibonacciProductor fibonacciProductor) {
        this.fibonacciProductor = fibonacciProductor;
    }

    public void sendNumbers(FibonacciRequest request) {
        fibonacciProductor.enviarNumerosARabbitMQ(request);
    }
}
