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
        if (marca == null || marca.trim().isEmpty()) {
            throw new IllegalArgumentException("Marca não pode ser vazia.");
        }
        if (modelo == null || modelo.trim().isEmpty()) {
            throw new IllegalArgumentException("Modelo não pode ser vazio.");
        }
        if (preco <= 0) {
            throw new IllegalArgumentException("Preço deve ser maior que zero.");
        }
        if (processador == null) {
            throw new IllegalArgumentException("Processador não pode ser nulo.");
        }
        if (memoriaRam == null) {
            throw new IllegalArgumentException("Memória RAM não pode ser nula.");
        }
        if (hd == null) {
            throw new IllegalArgumentException("HD não pode ser nulo.");
        }
        if (memoriaUSB == null) {
            throw new IllegalArgumentException("Memória USB não pode ser nula.");
        }
        if (sistemaOperacional == null) {
            throw new IllegalArgumentException("Sistema operacional não pode ser nulo.");
        }

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

    public void setMarca(String marca) {
        if (marca == null || marca.trim().isEmpty()) {
            throw new IllegalArgumentException("Marca não pode ser vazia.");
        }
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()) {
            throw new IllegalArgumentException("Modelo não pode ser vazio.");
        }
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco <= 0) {
            throw new IllegalArgumentException("Preço deve ser maior que zero.");
        }
        this.preco = preco;
    }

    public HardwareBasico getProcessador() {
        return processador;
    }

    public void setProcessador(HardwareBasico processador) {
        if (processador == null) {
            throw new IllegalArgumentException("Processador não pode ser nulo.");
        }
        this.processador = processador;
    }

    public HardwareBasico getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(HardwareBasico memoriaRam) {
        if (memoriaRam == null) {
            throw new IllegalArgumentException("Memória RAM não pode ser nula.");
        }
        this.memoriaRam = memoriaRam;
    }

    public HardwareBasico getHd() {
        return hd;
    }

    public void setHd(HardwareBasico hd) {
        if (hd == null) {
            throw new IllegalArgumentException("HD não pode ser nulo.");
        }
        this.hd = hd;
    }

    public MemoriaUSB getMemoriaUSB() {
        return memoriaUSB;
    }

    public void setMemoriaUSB(MemoriaUSB memoriaUSB) {
        if (memoriaUSB == null) {
            throw new IllegalArgumentException("Memória USB não pode ser nula.");
        }
        this.memoriaUSB = memoriaUSB;
    }

    public SistemaOperacional getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(SistemaOperacional sistemaOperacional) {
        if (sistemaOperacional == null) {
            throw new IllegalArgumentException("Sistema operacional não pode ser nulo.");
        }
        this.sistemaOperacional = sistemaOperacional;
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
