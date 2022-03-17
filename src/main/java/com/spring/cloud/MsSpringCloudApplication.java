package com.spring.cloud;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

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
	@Bean
	public Supplier<List<String>> getList() {
		/*Stream<String> cities = Stream.of("Sydney", "Dhaka", "New York", "London");
		 * 
		 * 
		 * To consume once
		 */
		ArrayList<String> cities = new ArrayList<String>();
		cities.add("Sydney");
		cities.add("Dhaka");
		return () ->cities ;
	}

	
}
