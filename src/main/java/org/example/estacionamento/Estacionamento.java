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

            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    estacionarVeiculo();
                    break;
                case 2:
                    removerVeiculo();
                    break;
                case 3:
                    listarVeiculos();
                    break;
                case 4:
                    System.out.println("\nVagas disponiveis: " + (MAX_VAGAS - vagas.size()));
                    break;
                case 5:
                    System.out.println("Sistema encerrado!");
                    break;
                default:
                    System.out.println("Opção invalida!");
            }
        } while (opcao != 5);

        scanner.close();
    }

    static void listarVeiculos() {
        if (vagas.isEmpty()) {
            System.out.println("Não há veículos para listar.");
            return;
        }

        System.out.println("\nVeiculos estacionados: ");
        for (Veiculo v : vagas) {
            System.out.println("Placa: " + v.getPlaca() + " | Modelo: " + v.getModelo());
        }
    }

    static void removerVeiculo() {
        if (vagas.isEmpty()) {
            System.out.println("Não há veículos para remover.");
            return;
        }

        System.out.print("\nDigite a placa do veiculo a ser removido: ");
        var placa = scanner.nextLine();

        for (Veiculo v : vagas) {
            if (v.mesmaPlaca(placa)) {
                var tempo = v.calcularTempoEstacionado();
                var valorAPagar = tempo * 5.0;
                System.out.println("Tempo estacionado: " + tempo + " Horas");
                System.out.println("Valor a pagar: " + valorAPagar + " reais");
                vagas.remove(v);
                System.out.println("Veiculo Removido com sucesso");
                return;
            }
        }
        System.out.println("Veiculo não encontrado!");
    }

    static void estacionarVeiculo() {
        if (vagas.size() >= MAX_VAGAS) {
            System.out.println("Estacionamento Lotado! Não há vagas disponiveis");
            return;
        }

        System.out.println("Digite a placa do veiculo: ");
        String placa = scanner.nextLine();

        System.out.println("Digite o modelo do veiculo: ");
        String modelo = scanner.nextLine();

        var veiculo = new Veiculo(placa, modelo);
        vagas.add(veiculo);

        System.out.println("Veiculo estacionado com sucesso!");

    }
}
