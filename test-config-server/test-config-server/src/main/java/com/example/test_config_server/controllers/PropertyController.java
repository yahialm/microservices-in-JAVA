package com.example.test_config_server.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class PropertyController {

    @Value("${salutation}")
    private String value1;

    @Value("${pi}")
    private double value2;

    @Value("${taux}")
    private double value3;

    @GetMapping("/keys")
    public Map<String, Object> prop() {
        return Map.of("salutation", value1,"pi",value2,"taux",value3);
    }
}