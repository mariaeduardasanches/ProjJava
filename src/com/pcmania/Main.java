package com.pcmania;

import com.pcmania.model.Cliente;
import com.pcmania.model.Computador;
import com.pcmania.model.HardwareBasico;
import com.pcmania.model.MemoriaUSB;
import com.pcmania.model.SistemaOperacional;
import com.pcmania.service.ProcessarPedido;

public class Main {
    public static void main(String[] args) {
        int matricula = 20240123;

        Cliente cliente = new Cliente("Ana Souza", "ana@email.com", "Rua A, 123");

        Computador[] computadores = new Computador[3];

        computadores[0] = new Computador(
                "Apple",
                "Promoção 1",
                matricula,
                new HardwareBasico("Pentium Core i5", 2200),
                new HardwareBasico("Memória RAM", 8),
                new HardwareBasico("HD", 500),
                new MemoriaUSB("Pen-drive", 16),
                new SistemaOperacional("macOS Sequoia", 64)
        );

        computadores[1] = new Computador(
                "Samsung",
                "Promoção 2",
                matricula + 1,
                new HardwareBasico("Pentium Core i7", 3370),
                new HardwareBasico("Memória RAM", 16),
                new HardwareBasico("HD", 1000),
                new MemoriaUSB("Pen-drive", 32),
                new SistemaOperacional("Windows 8", 64)
        );

        computadores[2] = new Computador(
                "Dell",
                "Promoção 3",
                matricula + 2,
                new HardwareBasico("Pentium Core i7", 4500),
                new HardwareBasico("Memória RAM", 32),
                new HardwareBasico("HD", 2000),
                new MemoriaUSB("HD Externo", 1000),
                new SistemaOperacional("Windows 10", 64)
        );

        System.out.println("=== Dados do cliente ===");
        System.out.println(cliente);

        System.out.println("\n=== Computadores escolhidos ===");
        for (Computador computador : computadores) {
            System.out.println(computador);
        }

        System.out.println("\n=== Pedido ===");
        ProcessarPedido.processarPedido(computadores);
    }
}
