package org.example.estacionamento;

import java.util.ArrayList;
import java.util.Scanner;

public class Estacionamento {
    static final int MAX_VAGAS = 10;

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Veiculo> vagas = new ArrayList<>();

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("### Estacionamento inteligente ###");
            System.out.println("1 - Estacionar Veiculo;");
            System.out.println("2 - Remover Veiculo;");
            System.out.println("3 - Listar Veiculo;");
            System.out.println("4 - Exibir Vagas Disponíveis;");
            System.out.println("5 - Sair;");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    estacionarVeiculo();
                    break;
                case 2:
                    //removerVeiculo();
                    break;
                case 3:
                    //listarVeiculos();
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Sistema encerrado!");
                default:
                    System.out.println("Opção invalida!");
            }
        } while (opcao != 5);
    }

    private static void estacionarVeiculo() {
        if (vagas.size() >= MAX_VAGAS) {
            System.out.println("Estacionamento Lotado! Não há vagas disponiveis");
            return;
        }

        System.out.println("Digite a placa do veiculo: ");
        String placa = scanner.nextLine();

        System.out.println("Digite o modelo do veiculo: ");
        String modelo = scanner.nextLine();

        long horaDeEntrada = System.currentTimeMillis();
        var veiculo = new Veiculo(placa, modelo, horaDeEntrada);
        vagas.add(veiculo);

        System.out.println("Veiculo estacionado com sucesso!");

    }
}
