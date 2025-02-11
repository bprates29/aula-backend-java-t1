package org.example.entrada_dados;

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Bem-vindo, ".concat(nome).concat("! Você tem ").concat(String.valueOf(idade)).concat(" anos."));
        sc.close();
    }
}
