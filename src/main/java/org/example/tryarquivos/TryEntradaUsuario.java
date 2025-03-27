package org.example.tryarquivos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryEntradaUsuario {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        try {
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();
            System.out.println("Você digitou o numero: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Você precisa digitar um numero inteiro");
        } finally {
            sc.close();
        }

    }
}
