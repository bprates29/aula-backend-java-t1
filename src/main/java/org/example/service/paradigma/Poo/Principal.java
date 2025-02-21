package org.example.service.paradigma.Poo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("digite a largura: ");
        double largura = sc.nextDouble();

        System.out.print("digite a altura: ");
        double altura = sc.nextDouble();

        Retangulo meuRetangulo = new Retangulo(largura, altura);

        System.out.println("Área do retangulo é " + meuRetangulo.calcularArea());
    }
}
