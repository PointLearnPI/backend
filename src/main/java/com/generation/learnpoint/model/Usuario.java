package com.generation.learnpoint.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo é obrigatório!")
	@Size(min = 3, max = 50, message = "O nome deve ter entre 3 e 50 caracteres")
	private String nomeu;
	
	@NotBlank(message = "O atributo é obrigatório!")
	@Size(min = 3, max = 50, message = "O login deve ter entre 3 e 50 caracteres")
	private String login;
	
	@NotBlank(message = "O atributo é obrigatório!")
	@Size(min = 5, max = 20, message = "A senha deve conter entre 5 e 20 caracteres")
	private String senha;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeu() {
		return nomeu;
	}

	public void setNomeu(String nomeu) {
		this.nomeu = nomeu;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
