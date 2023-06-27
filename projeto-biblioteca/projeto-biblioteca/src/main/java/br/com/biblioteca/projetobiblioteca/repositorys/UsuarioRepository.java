package br.com.biblioteca.projetobiblioteca.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.biblioteca.projetobiblioteca.entitys.Usuario;

/**
 *  Referência de apoio: https://pt.stackoverflow.com/questions/477436/como-criar-um-m%C3%A9todo-findby-customizado-para-spring
 * @author alifi
 *
 */

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {

	//verificação de usuario e senha, para realizar o acesso ao sistema
	Usuario findByLoginAndSenha(String login, String senha);
	
	/*//inserção de usuário no banco de dados
	Usuario save(Usuario usuario);*/
	
	
}
