package br.com.biblioteca.projetobiblioteca.dtos;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import br.com.biblioteca.projetobiblioteca.entitys.Usuario;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;
/***
 * 
 * @author alifi
 * Nessa classe dto, realizarei verificações importantes em relação ao campo
 */
@Component
@Data
public class UsuarioDTO {

	@Size(min = 5, max = 255) @NotEmpty
	private String nome;
	
	@Size(min = 5, max = 255) @NotEmpty
	private String login;
	
	@Size(min = 8, max = 20) @NotEmpty
	private String senha;
	
	public UsuarioDTO() {
		// TODO Auto-generated constructor stub
	}

	//passando os dados de Usuario para UsuarioDTO
	public UsuarioDTO(Usuario usuario) {
		//copiando os dados direto de uma classe para a outra
		BeanUtils.copyProperties(usuario, this);
	}
	

}
