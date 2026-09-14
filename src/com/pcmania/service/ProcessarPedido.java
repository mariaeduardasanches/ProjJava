package com.pcmania.service;

import com.pcmania.model.Computador;

public class ProcessarPedido {
    public static void processarPedido(Computador[] computadores) {
        System.out.println("Pedido enviado...");
        if (computadores == null || computadores.length == 0) {
            System.out.println("Nenhum computador no pedido.");
            return;
        }

        double total = 0;
        for (Computador computador : computadores) {
            if (computador != null) {
                total += computador.getPreco();
            }
        }

        System.out.println("Total do pedido: R$ " + String.format("%.2f", total));
    }
}
