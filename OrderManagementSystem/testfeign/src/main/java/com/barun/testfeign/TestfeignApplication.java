package com.barun.testfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableFeignClients
@Configuration
public class TestfeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestfeignApplication.class, args);
	}

}
