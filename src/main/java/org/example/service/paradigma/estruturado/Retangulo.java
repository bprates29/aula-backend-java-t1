package org.example.service.paradigma.estruturado;

import java.util.Scanner;

public class Retangulo {
    //Função para calcular a área
    public static double calcularArea(double largura, double altura) {
        return largura * altura;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("digite a largura: ");
        double largura = sc.nextDouble();

        System.out.print("digite a altura: ");
        double altura = sc.nextDouble();

        double area = calcularArea(largura, altura);

        System.out.println("Área do retangulo é " + area);

    }

}
