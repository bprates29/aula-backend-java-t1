package org.example.service;

import java.sql.SQLOutput;

public class TesteOperadores {
    public static void main(String[] args) {
        // Operadores Aritméticos
        System.out.println("### Operadores Aritméticos ###");
        int a = 10, b = 3;
        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Modulo: " + (a % b));
        System.out.println("Divisão em ponto flutuante: " + (10.0 / 3.0));

        // Operadores de Atribuição
        System.out.println("\n### Operadores de Atribuição ###");
        int c = 5;
        System.out.println("Valor inicial de c: " + c);
        c += 2; // c = c + 2
        System.out.println("Valor de c agora é: " + c);
        c -= 3; // c = c - 3
        System.out.println("Valor de c: " + c);
        c *= 4;
        System.out.println("Valor inicial de c: " + c);
        c /= 2;
        System.out.println("Valor inicial de c: " + c);
        c %= 3;
        System.out.println("Valor inicial de c: " + c);

        System.out.println("\n### Operadores de incremento e decremento ###");
        int x = 5;
        System.out.println("Valor inicial de x: " + x); //?
        System.out.println("Pré-incremento: " + (++x)); //?
        System.out.println("Pós-incremento: " + (x++)); //?
        System.out.println("Valor final de x: " + x); //?

        System.out.println("\n### Operadores relacionais ###");
        System.out.println("10 > 5: " + (10 > 5));
        System.out.println("10 < 5: " + (10 < 5));
        System.out.println("10 >= 5: " + (10 >= 5));
        System.out.println("10 <= 5: " + (10 <= 5));
        System.out.println("10 == 5: " + (10 == 5));
        System.out.println("10 != 5: " + (10 != 5));

        System.out.println("\n### Operadores lógicos ###");
        boolean cond1 = true;
        boolean cond2 = false;
        System.out.println("true && false: " + (cond1 && cond2));
        System.out.println("true || false: " + (cond1 || cond2));
        System.out.println("!true: " + (!cond1));
        System.out.println("true ^ false (XOR): " + (false ^ true));

        // Operadores de curto-circuito
        System.out.println("\nOperadores de curto-circuito");
        int n = 10, d = 0;
        if (d != 0 && (n / d) > 2) {
            System.out.println("Não vai dividir por 0");
        } else {
            System.out.println("A operação foi evitada;");
        }
    }
}
