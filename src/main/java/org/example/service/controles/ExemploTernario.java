package org.example.service.controles;

import java.util.Scanner;

public class ExemploTernario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Digite sua idade: ");
//        int idade = sc.nextInt();
//
//        // Usando if-else
//        String categoria;
//        if (idade >= 18) {
//            categoria = "Adulto";
//        } else {
//            categoria = "Menor de idade";
//        }
//        System.out.println("Categoria com if-else: " + categoria);
//
//        // Usando operador ternario
//        String categoriaTer = (idade >= 18) ? "Adulto" : "Menor de idade";
//        System.out.println("Categoria ternário: " + categoriaTer);

        System.out.println("Digite seu saldo: ");
        double saldo = sc.nextDouble();

        // Conta Premium, padrão, basica
        String tipoConta = (saldo > 10000) ? "Contra Premium" :
                (saldo >= 1000) ? "Conta Padrão" : "Conta basica";

        System.out.println("Tipo da conta: " + tipoConta);

        sc.close();
    }
}
