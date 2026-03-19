package com.example.demo.service;

import com.example.demo.model.HelloResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloServiceTest {

    private final HelloService helloService = new HelloService();

    @Test
    void testGetMessage() {
        HelloResponse response = helloService.getMessage();
        assertEquals("Hello from Gradle Microservice 🚀", response.getMessage());
    }
}
