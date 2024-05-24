package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		String DBPassword = "Admin@7593487";

		String name = "Ewa";

		System.out.println(name);

		// System.out.println("Hello"); 
		// System.out.println("World");
	}

}
