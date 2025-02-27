package org.example.objetos;

public class TestesCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Fusca", 1970);
        Carro carro3 = new Carro("Fusca", 1970);
        Carro carro2 = new Carro("Civic", 2020);

        carro1.toString();
        carro1.equals(carro3);
        carro1.hashCode();

        System.out.println("Carros iguais: " + carro1.equals(carro3));


        System.out.println(carro1);
        System.out.println(carro2);
    }
}
