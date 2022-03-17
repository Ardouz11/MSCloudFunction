package com.spring.cloud;

import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MsSpringCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsSpringCloudApplication.class, args);
	}
	@Bean
	public Function<String, String> uppercase() {
		return value -> value.toUpperCase();
	}
}