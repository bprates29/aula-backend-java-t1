package org.example.arrays.exemplo;

import java.util.ArrayList;
import java.util.List;

public class ExemploArrayList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        ArrayList<Integer> numeros = new ArrayList<Integer>();

        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Carlos");
        System.out.println(nomes);

        nomes.add(1, "Ana");
        System.out.println(nomes);

        System.out.println("Primeiro nome: " + nomes.getFirst());
        System.out.println("Tamanho da lista: " + nomes.size());

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("Nome na posição " + i + " = " + nomes.get(i));
        }

        for (String nome : nomes) {
            System.out.println(nome);
        }

        nomes.forEach(System.out::print);

        System.out.println();
        //Removendo elementos
//        nomes.remove(2);
//        nomes.remove("Carlos");
//        System.out.println(nomes);

        nomes.set(2, "Joana");

    }
}
