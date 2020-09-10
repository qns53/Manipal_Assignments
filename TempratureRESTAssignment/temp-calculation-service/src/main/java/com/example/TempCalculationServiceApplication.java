package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TempCalculationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TempCalculationServiceApplication.class, args);
	}

}
