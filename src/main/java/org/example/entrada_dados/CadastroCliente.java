package org.example.entrada_dados;

import java.util.Scanner;

public class CadastroCliente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        var nome = sc.nextLine();

        System.out.print("Digite seu CPF: ");
        var cpf = sc.nextLine();

        System.out.print("Digite sua idade: ");
        var idade = sc.nextInt();

        System.out.print("Digite seu saldo incial: ");
        var saldo = sc.nextDouble();

        System.out.print("Conta atica?: (true/false) - ");
        var contaAtiva = sc.nextBoolean();

        System.out.println("\n\nResumo do cadastro:");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
        System.out.println("Soldo da conta: " + saldo);
        System.out.println("Conta ativa: " + contaAtiva);

        sc.close();
    }
}
