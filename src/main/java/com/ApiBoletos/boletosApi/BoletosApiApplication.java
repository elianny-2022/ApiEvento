package com.ApiBoletos.boletosApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.CrossOrigin;

@EntityScan("com.ApiBoletos.boletosApi.Models")
@SpringBootApplication
@CrossOrigin(origins = "http://localhost:8080")
public class BoletosApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoletosApiApplication.class, args);
	}

}
