package com.oauth.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/pruebas")
@RestController
public class PruebaRestController {

	@GetMapping("/saludo")
	public String saludo() {
		return "Pruebaaas";
	}
	
}

