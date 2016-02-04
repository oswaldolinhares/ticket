package com.aprendendospringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController - Anotação que indica que controlador responderá em JSON
//@RequestMapping - Anotação que define o caminho do serviço
@RestController
@RequestMapping("/")
public class TicketController {
	//@RequestMapping - Indica que esse método é acessível pelo browser
	@RequestMapping
	public String teste(){
		return "Testando Ambiente";
	}
	
}
