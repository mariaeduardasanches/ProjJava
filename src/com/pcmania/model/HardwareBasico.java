package com.pcmania.model;

public class HardwareBasico {
    private String nome;
    private int capacidade;

    public HardwareBasico(String nome, int capacidade) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do hardware não pode ser vazio.");
        }
        if (capacidade <= 0) {
            throw new IllegalArgumentException("Capacidade do hardware deve ser maior que zero.");
        }

        this.nome = nome;
        this.capacidade = capacidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do hardware não pode ser vazio.");
        }
        this.nome = nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        if (capacidade <= 0) {
            throw new IllegalArgumentException("Capacidade do hardware deve ser maior que zero.");
        }
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return nome + " - " + capacidade;
    }
}
