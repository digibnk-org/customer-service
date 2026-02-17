package com.digibnk.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.digibnk.customer", "com.digibnk.common"}) // Scan for common lib components
public class CustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}

}
