package com.example.cars_api;

import com.example.cars_api.cars.cars;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class CarsApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(CarsApiApplication.class, args);
	}
}
