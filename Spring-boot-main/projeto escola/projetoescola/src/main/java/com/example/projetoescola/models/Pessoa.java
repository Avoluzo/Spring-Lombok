package com.example.projetoescola.models;

import jakarta.persistence.Entity;

@Entity
public class Pessoa {
    
    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", id=" + id + "]";
    }
    private String nome;
    private Long id;

    
    public Pessoa(String nome, Long id) {
        this.nome = nome;
        this.id = id;
    }

    public Pessoa() {
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    
}
