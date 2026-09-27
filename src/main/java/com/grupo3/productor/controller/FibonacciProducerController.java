package com.grupo3.productor.controller;

import com.grupo3.productor.dto.FibonacciRequest;
import com.grupo3.productor.service.FibonacciProducerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/fibonacci")
public class FibonacciProducerController {

    private final FibonacciProducerService fibonacciProducerService;

    public FibonacciProducerController(FibonacciProducerService fibonacciProducerService) {
        this.fibonacciProducerService = fibonacciProducerService;
    }

    @GetMapping("/send")
    public ResponseEntity<String> sendNumbers(@RequestParam String numbers) {
        FibonacciRequest request = new FibonacciRequest(numbers);
        fibonacciProducerService.sendNumbers(request);
        return ResponseEntity.ok("Lista enviada a RabbitMQ correctamente.");
    }
}
