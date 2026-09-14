package com.pcmania.model;

public class Cliente {
    private String nome;
    private String email;
    private String endereco;

    public Cliente(String nome, String email, String endereco) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do cliente não pode ser vazio.");
        }
        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("E-mail do cliente não pode ser vazio.");
        }
        if (endereco == null || endereco.trim().isEmpty()) {
            throw new IllegalArgumentException("Endereço do cliente não pode ser vazio.");
        }

        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
