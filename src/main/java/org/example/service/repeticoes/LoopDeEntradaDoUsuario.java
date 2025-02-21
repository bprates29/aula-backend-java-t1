package org.example.service.repeticoes;

import java.util.Scanner;

public class LoopDeEntradaDoUsuario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pedido;

        do {
            System.out.println("Digite o seu pedido ou 'sair' pra encerrar");
            pedido = sc.nextLine();
            if(!pedido.equalsIgnoreCase("sair")) {
                System.out.println("Pedido anotado: " + pedido);
            }

        } while (!pedido.equalsIgnoreCase("sair"));

        System.out.println("Sistema encerrado!");
        sc.close();
    }

}
