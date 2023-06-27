package br.com.biblioteca.projetobiblioteca.customerAPI;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import br.com.biblioteca.projetobiblioteca.dtos.UsuarioDTO;
import br.com.biblioteca.projetobiblioteca.entitys.Usuario;

@Component
public class UsuarioConversor {
	
	//Conversão de Usuário para Usuário DTO
	public UsuarioDTO converterUsuarioParaDTO(Usuario usuario) {
		ModelMapper modelMapper = new ModelMapper();
		UsuarioDTO usuarioDTO = modelMapper.map(usuario, UsuarioDTO.class);
		return usuarioDTO;
	}
	
	//Conversão de UsuárioDTO para Usuário
	public Usuario conveterUsuarioDTOParaUsuario(UsuarioDTO usuarioDTO) {
		ModelMapper modelMapper = new ModelMapper();
		Usuario usuario = modelMapper.map(usuarioDTO, Usuario.class);
		return usuario;
	}

}
