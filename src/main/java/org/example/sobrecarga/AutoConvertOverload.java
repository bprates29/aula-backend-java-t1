package org.example.sobrecarga;

public class AutoConvertOverload {
    void f(byte x) {
        System.out.println("Dentro do f(byte): " + x);
    }

    void f(int x) {
        System.out.println("Dentro do f(int): " + x);
    }

    void f(double x) {
        System.out.println("Dentro do f(double): " + x);
    }
}
