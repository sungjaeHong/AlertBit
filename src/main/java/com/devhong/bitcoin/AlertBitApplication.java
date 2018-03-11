package com.devhong.bitcoin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages = "com.devhong.bitcoin"
)
public class AlertBitApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlertBitApplication.class, args);
	}
}
