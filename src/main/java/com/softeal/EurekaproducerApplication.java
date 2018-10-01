package com.softeal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaproducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaproducerApplication.class, args);
	}
}
