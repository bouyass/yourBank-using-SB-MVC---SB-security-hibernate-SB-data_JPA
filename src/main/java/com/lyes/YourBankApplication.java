package com.lyes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@EntityScan("com.lyes.entities")
@SpringBootApplication
public class YourBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(YourBankApplication.class, args);
	}

}
