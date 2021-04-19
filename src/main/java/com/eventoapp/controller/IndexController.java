package com.eventoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Mostra para o spring que é um Controller
@Controller
public class IndexController {

	@RequestMapping("/")
	public String index() {
		return "index";		
	}
}
