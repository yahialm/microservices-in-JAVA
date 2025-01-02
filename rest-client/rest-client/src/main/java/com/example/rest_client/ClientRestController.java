package com.example.rest_client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientRestController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/get-service-message")
    public String getServiceMessage() {
        String url = "http://localhost:8888/service-one"; // service-one est enregistré
        return restTemplate.getForObject(url, String.class);
    }
}