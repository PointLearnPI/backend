package com.generation.learnpoint.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo é obrigatório!")
	@Size(min = 3, max = 50, message = "O nome do produto deve ter entre 3 e 50 caracteres")
	private String nomep;
	
	@NotBlank(message = "O atributo é obrigatório!")
	@Size(min = 30, max = 2000, message = "O nome do produto deve ter entre 30 e 1000 caracteres")
	private String descricao;
	
	@NotNull
	private Double preco;
	
	@NotNull
	private int duracao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomep() {
		return nomep;
	}

	public void setNomep(String nomep) {
		this.nomep = nomep;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	
	

}
