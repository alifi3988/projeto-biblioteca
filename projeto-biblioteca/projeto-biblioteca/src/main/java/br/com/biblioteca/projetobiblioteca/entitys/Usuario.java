package br.com.biblioteca.projetobiblioteca.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Data
@Table(name = "tb_usuarios")
public class Usuario {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String login;
	
	@Column(nullable = false)
	private String senha;
	
	//Eu estava pensando em colocar um nível para cada usuário para ter noção de qual tela pode acessar
	//@Getter @Setter @Column(nullable = false)
	//private String		nivel;
	
	//@Column(name = "statusAssociativo", columnDefinition = "boolean default false")
	//private Boolean status;
	
}
