package org.example.service.controles;

import java.util.Scanner;

public class VerificaSaldo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu saldo: ");
        double saldo = sc.nextDouble();

        System.out.print("Digite o valor do saque: ");
        double saque = sc.nextDouble();

        if (saque < saldo) {
            saldo -= saque;
            System.out.println("Saque realizado! Novo saldo: " + saldo);
        } else if (saque == saldo) {
            System.out.println("Você realizou o saque total, seu saldo é 0");
        } else {
            System.out.println("Saldo insuficiente para o saque!");
        }

        sc.close();

//        switch (expressão) {
//            case valor1:
//                //executa essa linha
//                break;
//            case valor2:
//                //executa esse cara
//                break;
//            default:
//                // executa caso nenhum dos valores forem correspondentes
//        }
    }
}
