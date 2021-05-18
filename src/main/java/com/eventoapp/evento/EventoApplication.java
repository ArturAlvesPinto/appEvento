package com.eventoapp.evento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.eventoapp.models.Evento;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackageClasses = { Evento.class })
@ComponentScan({"com.eventoapp.controller"}) //Necessário colocar caso a versão do spring seja 2.0
											// Também foi preciso colocar a dependencia "org.apache.tomcat.embed" no pom.xml	
public class EventoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventoApplication.class, args);
	}

}
