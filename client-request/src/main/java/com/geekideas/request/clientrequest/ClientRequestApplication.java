package com.geekideas.request.clientrequest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ClientRequestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientRequestApplication.class, args);
	}
}
