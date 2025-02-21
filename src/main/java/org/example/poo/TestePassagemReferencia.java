package org.example.poo;

public class TestePassagemReferencia {
    static void aumentarVelocidade(Veiculo v) {
        v.velocidade += 20;
        System.out.println("Detro do método: " + v.velocidade);
    }

    public static void main(String[] args) {
        Veiculo carro = new Veiculo(10,10,10);
        carro.velocidade = 100;
        System.out.println(carro.velocidade);
        aumentarVelocidade(carro);
        System.out.println(carro.velocidade);
    }
}
