package com.ms.customer.service;

import com.ms.customer.service.entities.Customer;
import com.ms.customer.service.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CustomerRepository customerRepository){
		return args -> {
			customerRepository.save(new Customer(null, "aa", "a@a.a"));
			customerRepository.save(new Customer(null, "bb", "b@b.b"));
			customerRepository.save(new Customer(null, "cc", "c@c.c"));
		};
	}
}
