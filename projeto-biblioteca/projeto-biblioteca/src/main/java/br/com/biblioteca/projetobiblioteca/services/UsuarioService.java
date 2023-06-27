package br.com.biblioteca.projetobiblioteca.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.biblioteca.projetobiblioteca.customerAPI.UsuarioConversor;
import br.com.biblioteca.projetobiblioteca.dtos.UsuarioDTO;
import br.com.biblioteca.projetobiblioteca.entitys.Usuario;
import br.com.biblioteca.projetobiblioteca.repositorys.UsuarioRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioConversor usuarioConversor;
	
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	//salvar um suusário
	@Transactional
	public Usuario inserirUsuario(UsuarioDTO usuarioDTO) {
		System.out.println(usuarioDTO);
		Usuario user = usuarioConversor.conveterUsuarioDTOParaUsuario(usuarioDTO);
		System.out.println(user);
		return usuarioRepository.save(user);
	}
	
	//realizando a verificação de usuario e senha
	@Transactional
	public Boolean verificarLoginAndSenha(@Valid String usuario, @Valid String senha){
		var usuarioNovo = usuarioRepository.findByLoginAndSenha(usuario, senha);
		if(usuarioNovo == null) return false;
		return true;
	}
	
	//bsucando todos os dados de Usuario e retornando no formato UsuarioDTO
	@Transactional
	public List<UsuarioDTO> findAll(){
		List<Usuario> usuarios = usuarioRepository.findAll();
		return usuarios.stream().map(x -> new UsuarioDTO(x)).toList();
	}
}
