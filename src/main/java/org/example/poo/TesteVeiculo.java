package org.example.poo;

public class TesteVeiculo {
    public static void main(String[] args) {
        Veiculo carro1 = new Veiculo(5, 50, 12);
        Veiculo carro2 = new Veiculo(2, 35, 20);

        //carro1 = carro2;

        carro1.apresentacao();
        carro1.exibirAutonomia();
        carro2.apresentacao();
        carro2.exibirAutonomia();

        int autonomia = carro1.calcularAutonomia();
        System.out.println("Autonomia carro1: " + autonomia);

        Veiculo carro3 = new Veiculo(5, 56, 16);
        carro3.consumo = 12;

        carro3.apresentacao();

        int distancia = carro3.calcularDistancia(10);

        System.out.println("Com 10 litros, o carro percorre " + distancia);
    }
}
