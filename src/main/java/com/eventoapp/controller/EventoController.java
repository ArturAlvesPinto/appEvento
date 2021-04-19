package com.eventoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventoController {

		@RequestMapping(value="/cadastrarEvento")
		public String form() {
			return "evento/formEvento"; //formEvento será um arquivo HTML (resource > templates > evento)
		}
	
}
