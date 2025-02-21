package org.example.poo;

public class Veiculo {
    int passageiros; //numero de passageiros
    int capacidadeCombustivel;
    int consumo;
    int velocidade;

    //Construtor
    Veiculo (int passageiros, int capacidadeDoTanque, int consumo) {
        this.passageiros = passageiros;
        capacidadeCombustivel = capacidadeDoTanque;
        this.consumo = consumo;
    }

    void acelerar() {
        this.velocidade += 10;
    }

    void exibirAutonomia() {
        System.out.println("Autonomia: " + (capacidadeCombustivel * consumo) + " km");
    }

    void apresentacao() {
        System.out.println("O carro pode levar " + passageiros + " passageiros.");
        System.out.println("O tanque tem capacidade para " + capacidadeCombustivel + " litros.");
        System.out.println("O carro faz " + consumo + " km por litro.");
    }

    int calcularAutonomia() {
        return capacidadeCombustivel * consumo * 2;
    }

    void verificarAutonomia(int autonomia) {
        if (autonomia < 50) {
            System.out.println("Atenção autonomia muito baixa");
            return;
        }
        System.out.println("Autonomia suficiente!");
    }

    int calcularDistancia (int litros) {
        return litros * consumo;
    }

    String verificarCombustivel (double litros) {
        if (litros <= 0) {
            return "Tanque vazio!";
        } else if (litros < 10) {
            return "Combustivel baixo, melhor abastecer";
        } else {
            return "Tanque com um bom nível";
        }
    }

    void nomeDoMetodo(int value) {
        // bloco de  código
    }
}
