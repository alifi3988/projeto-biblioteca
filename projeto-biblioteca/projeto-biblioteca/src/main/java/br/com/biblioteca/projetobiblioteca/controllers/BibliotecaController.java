package br.com.biblioteca.projetobiblioteca.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.biblioteca.projetobiblioteca.view.LoginView;


@RestController
@RequestMapping("/")
public class BibliotecaController {
	
	
	@GetMapping
	public void inicial() {
		LoginView login = new LoginView();
		login.setVisible(true);
	}

}
