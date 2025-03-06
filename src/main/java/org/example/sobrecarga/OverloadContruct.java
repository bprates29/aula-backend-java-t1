package org.example.sobrecarga;

public class OverloadContruct {
    int x;

    OverloadContruct() {
        System.out.println("Contrutor sem parametros");
        x = 0;
    }

    OverloadContruct(int a) {
        System.out.println("Contrutor com um parametro: " + a);
        x = a;
    }

    OverloadContruct(int a, int b) {
        System.out.println("Contrutor com dois parametro: " + a + ". b: " + b);
        x = a * b;
    }

    OverloadContruct(OverloadContruct oc) {
        System.out.println("Contrutor com o objeto: " + oc);
        x = oc.x;
    }
}
