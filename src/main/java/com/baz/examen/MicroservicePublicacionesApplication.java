package com.baz.examen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MicroservicePublicacionesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicePublicacionesApplication.class, args);
	}

}
