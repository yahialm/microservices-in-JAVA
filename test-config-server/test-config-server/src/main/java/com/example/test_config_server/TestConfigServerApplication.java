package com.example.test_config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
class TestConfigServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(TestConfigServerApplication.class, args);
	}

}
