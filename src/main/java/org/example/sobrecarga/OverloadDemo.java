package org.example.sobrecarga;

public class OverloadDemo {
    void ovlDemo() {
        System.out.println("Sem parâmetros.");
    }

    void ovlDemo(int a) {
        System.out.println("Um parametro: " + a);
    }

    int ovlDemo(int a, int b) {
        System.out.println("Dois parametros: 1) " + a + ". Segundo: " + b);
        return a + b;
    }

    double ovlDemo(double a, double b) {
        System.out.println("Dois parametros double: 1) " + a + ". Segundo: " + b);
        return a + b;
    }
}
