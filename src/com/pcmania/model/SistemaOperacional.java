package com.pcmania.model;

public class SistemaOperacional {
    private String nome;
    private int tipo;

    public SistemaOperacional(String nome, int tipo) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do sistema operacional não pode ser vazio.");
        }
        if (tipo <= 0) {
            throw new IllegalArgumentException("Tipo do sistema operacional deve ser maior que zero.");
        }

        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public int getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return nome + " - " + tipo + " bits";
    }
}
