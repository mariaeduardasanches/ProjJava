package com.pcmania.model;

public class MemoriaUSB {
    private String nome;
    private int capacidade;

    public MemoriaUSB(String nome, int capacidade) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome da memória USB não pode ser vazio.");
        }
        if (capacidade <= 0) {
            throw new IllegalArgumentException("Capacidade da memória USB deve ser maior que zero.");
        }

        this.nome = nome;
        this.capacidade = capacidade;
    }

    public String getNome() {
        return nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    @Override
    public String toString() {
        return nome + " - " + capacidade + " GB";
    }
}
