package br.com.biblioteca.projetobiblioteca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import br.com.biblioteca.projetobiblioteca.dtos.UsuarioDTO;
import br.com.biblioteca.projetobiblioteca.services.UsuarioService;
		


@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	//@Autowired
	//private UsuarioDTO usuarioDto;
	
	
	//retornando todos os usuarios {se tornou a raíz}
	@GetMapping
	public List<UsuarioDTO> retornarUsuarios(){
		return usuarioService.findAll();
	}
	
	//salvar um usuário no banco de dados
	@PostMapping(value = "/cadastro")
	public ResponseEntity<String> inserirUsuario(@RequestBody UsuarioDTO usuarioDTO){
		
		try {
			var usuario = usuarioService.inserirUsuario(usuarioDTO);
			
			if(usuario != null)
				return ResponseEntity.status(HttpStatus.ACCEPTED).body(usuario.toString());
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Erro: " + e.getMessage());
		}
		
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Não foi possível realizar o registro. Erro interno!");

	}
	
	
	//validando o acesso para acessar a futura aplicação webService
	@GetMapping(value = "/acesso")
	public ResponseEntity<String> validacaoLogin(@RequestParam String login, @RequestParam String senha){

		Boolean usuarioDto = usuarioService.verificarLoginAndSenha(login, senha);
		
		if(usuarioDto == true)
			return ResponseEntity.status(HttpStatus.ACCEPTED).body("Usuário foi identificado!");
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Usuário não foi identificado!");
	}
}
