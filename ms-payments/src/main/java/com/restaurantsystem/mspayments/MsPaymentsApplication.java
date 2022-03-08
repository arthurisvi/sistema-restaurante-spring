package com.restaurantsystem.mspayments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsPaymentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsPaymentsApplication.class, args);
	}

}
