package com.pcmania.service;

import com.pcmania.model.Computador;

public class ProcessarPedido {
    public static void processarPedido(Computador[] computadores) {
        System.out.println("Pedido enviado...");

        double total = 0;
        for (Computador computador : computadores) {
            if (computador != null) {
                total += computador.getPreco();
            }
        }

        System.out.println("Total da compra: R$ " + String.format("%.2f", total));
    }
}
