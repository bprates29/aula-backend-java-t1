package org.example.entrada_dados;

import java.util.Scanner;

public class ErroComum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu saldo: ");
        var saldo = sc.nextDouble();
        sc.nextLine();

        System.out.print("Digite sua cidade: ");
        String cidade = sc.next();

        System.out.println(cidade);
    }

}
