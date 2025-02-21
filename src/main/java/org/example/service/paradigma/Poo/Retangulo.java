package org.example.service.paradigma.Poo;

public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo (double lar, double altura) {
        largura = lar;
        this.altura = altura;
    }

    public double calcularArea () {
        return this.largura * altura * valorOculto();
    }

    private double valorOculto () {
        return 30.0;
    }
}
