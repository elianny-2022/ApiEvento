package com.ApiBoletos.boletosApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = "http://localhost:8080")
public class BoletosApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoletosApiApplication.class, args);
	}

}