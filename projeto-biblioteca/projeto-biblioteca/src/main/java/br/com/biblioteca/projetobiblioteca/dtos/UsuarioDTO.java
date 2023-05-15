package br.com.biblioteca.projetobiblioteca.dtos;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
/***
 * 
 * @author alifi
 * Nessa classe dto, realizarei verificações importantes em relação ao campo
 */
@Component
public class UsuarioDTO {

	@Size(min = 5, max = 255) @NotEmpty
	private String nome;
	
	@Size(min = 5, max = 255) @NotEmpty
	private String login;
	
	@Size(min = 8, max = 20) @NotEmpty
	private String senha;
	
	@NotEmpty  @Value(value = "true")
	private Boolean status;
	

}
