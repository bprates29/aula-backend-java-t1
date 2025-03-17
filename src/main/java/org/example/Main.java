package org.example;

import org.example.interfaces.GerenciadorDeContas;
import org.example.interfaces.RegistroAuditoria;
import org.example.interfaces.RegistroAuditoriaCompleta;
import org.example.interfaces.RegistroAuditoriaSimples;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int idade = 25;

        quadrado(idade);

        System.out.printf("Hello and welcome!");

        GerenciadorDeContas gerenciadorDeContasSimples = new GerenciadorDeContas(
                new RegistroAuditoriaSimples());
        GerenciadorDeContas gerenciadorDeContasCompleta = new GerenciadorDeContas(
                new RegistroAuditoriaCompleta());

    }

    public static int quadrado(int numero) {
        System.out.println("cheguei aqui, valor de numero: " + numero);
        return numero * 2;
    }
}