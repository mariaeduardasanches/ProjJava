package com.pcmania;

import com.pcmania.model.Cliente;
import com.pcmania.model.Computador;
import com.pcmania.model.HardwareBasico;
import com.pcmania.model.MemoriaUSB;
import com.pcmania.model.SistemaOperacional;
import com.pcmania.service.ProcessarPedido;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe sua matricula:");
        int matricula = Integer.parseInt(scanner.nextLine());

        System.out.println("Informe seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Informe seu email:");
        String email = scanner.nextLine();

        System.out.println("Informe seu endereco:");
        String endereco = scanner.nextLine();

        Cliente cliente = new Cliente(nome, email, endereco);

        Computador[] computadores = new Computador[10];
        int quantidade = 0;
        int opcao;

        do {
            System.out.println("\nEscolha a promocao:");
            System.out.println("1 - Promocao 1");
            System.out.println("2 - Promocao 2");
            System.out.println("3 - Promocao 3");
            System.out.println("0 - Finalizar compra");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                computadores[quantidade] = criarPromocao1(matricula);
                quantidade++;
            } else if (opcao == 2) {
                computadores[quantidade] = criarPromocao2(matricula);
                quantidade++;
            } else if (opcao == 3) {
                computadores[quantidade] = criarPromocao3(matricula);
                quantidade++;
            } else if (opcao != 0) {
                System.out.println("Opcao invalida!");
            }
        } while (opcao != 0);

        Computador[] compra = new Computador[quantidade];
        for (int i = 0; i < quantidade; i++) {
            compra[i] = computadores[i];
        }

        System.out.println("\n=== Dados do cliente ===");
        System.out.println(cliente);

        System.out.println("\n=== PCs adquiridos ===");
        for (int i = 0; i < quantidade; i++) {
            System.out.println(compra[i]);
        }

        System.out.println("\n=== Pedido ===");
        ProcessarPedido.processarPedido(compra);
    }

    private static Computador criarPromocao1(int matricula) {
        return new Computador(
                "Apple",
                "Promocao 1",
                matricula,
                new HardwareBasico("Pentium Core i5", 2200),
                new HardwareBasico("Memoria RAM", 8),
                new HardwareBasico("HD", 500),
                new MemoriaUSB("Pen-drive", 16),
                new SistemaOperacional("macOS Sequoia", 64)
        );
    }

    private static Computador criarPromocao2(int matricula) {
        return new Computador(
                "Samsung",
                "Promocao 2",
                matricula + 1,
                new HardwareBasico("Pentium Core i7", 3370),
                new HardwareBasico("Memoria RAM", 16),
                new HardwareBasico("HD", 1000),
                new MemoriaUSB("Pen-drive", 32),
                new SistemaOperacional("Windows 8", 64)
        );
    }

    private static Computador criarPromocao3(int matricula) {
        return new Computador(
                "Dell",
                "Promocao 3",
                matricula + 2,
                new HardwareBasico("Pentium Core i7", 4500),
                new HardwareBasico("Memoria RAM", 32),
                new HardwareBasico("HD", 2000),
                new MemoriaUSB("HD Externo", 1000),
                new SistemaOperacional("Windows 10", 64)
        );
    }
}
