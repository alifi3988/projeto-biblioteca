package br.com.biblioteca.projetobiblioteca.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class BibliotecaController {
	
	@GetMapping
	public String inicial() {
		return "Página Inicial!";
	}

}
