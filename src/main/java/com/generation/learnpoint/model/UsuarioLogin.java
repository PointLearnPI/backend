package com.generation.learnpoint.model;

public class UsuarioLogin {

	private Long id;

	private String nomeu;

	private String usuario;

	private String senha;

	private String token;

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

	public String getUsuario() {
		return usuario;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}