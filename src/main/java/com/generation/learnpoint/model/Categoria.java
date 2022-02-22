package com.generation.learnpoint.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;



@Entity
@Table(name = "tb_categoria")
public class Categoria {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O atributo é obrigatório!")
    @Size(min = 3, max = 50, message = "O nome da categoria deve ter entre 3 e 50 caracteres")
    private String nome_c;

    @NotBlank(message = "O atributo é obrigatório!")
    @Size(min = 30, max = 1000, message = "O nome da categoria deve ter entre 30 e 1000 caracteres")
    private String descricao_c;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome_c() {
        return nome_c;
    }

    public void setNome_c(String nome_c) {
        this.nome_c = nome_c;
    }

    public String getDescricao_c() {
        return descricao_c;
    }

    public void setDescricao_c(String descricao_c) {
        this.descricao_c = descricao_c;
    }




}