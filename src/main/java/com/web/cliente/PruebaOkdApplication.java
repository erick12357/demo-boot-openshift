package com.web.cliente;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PruebaOkdApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaOkdApplication.class, args);
	}

	@GetMapping("/")
	public String hola() {
		return "hola";
	}
	
	@GetMapping("/saludo/{nombre}")
	public String saludo(@PathVariable String nombre) {
		return "hola "+nombre;
	}

}
