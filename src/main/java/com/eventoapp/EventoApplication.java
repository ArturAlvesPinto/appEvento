package com.eventoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

/*-- Essas notações podem ser usadas caso a classe principal não esteja na raiz do projeto. --*/

// @EntityScan(basePackages = {"com.eventoapp.models"}) 
// @ComponentScan({"com.eventoapp.controller"})

/*-- --*/
												
public class EventoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventoApplication.class, args);
	}

}
