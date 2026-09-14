package com.pcmania.model;

public class Computador {
    private String marca;
    private String modelo;
    private double preco;
    private HardwareBasico processador;
    private HardwareBasico memoriaRam;
    private HardwareBasico hd;
    private MemoriaUSB memoriaUSB;
    private SistemaOperacional sistemaOperacional;

    public Computador(String marca, String modelo, double preco,
                      HardwareBasico processador, HardwareBasico memoriaRam,
                      HardwareBasico hd, MemoriaUSB memoriaUSB,
                      SistemaOperacional sistemaOperacional) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.processador = processador;
        this.memoriaRam = memoriaRam;
        this.hd = hd;
        this.memoriaUSB = memoriaUSB;
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPreco() {
        return preco;
    }

    public HardwareBasico getProcessador() {
        return processador;
    }

    public HardwareBasico getMemoriaRam() {
        return memoriaRam;
    }

    public HardwareBasico getHd() {
        return hd;
    }

    public MemoriaUSB getMemoriaUSB() {
        return memoriaUSB;
    }

    public SistemaOperacional getSistemaOperacional() {
        return sistemaOperacional;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", preco=" + preco +
                ", processador=" + processador +
                ", memoriaRam=" + memoriaRam +
                ", hd=" + hd +
                ", memoriaUSB=" + memoriaUSB +
                ", sistemaOperacional=" + sistemaOperacional +
                '}';
    }
}
