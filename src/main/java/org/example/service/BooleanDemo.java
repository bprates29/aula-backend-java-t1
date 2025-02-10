package org.example.service;

public class BooleanDemo {
    public static void main(String[] args) {
        boolean status = true;
        System.out.println("O valor é: " + status);

        status = false;
        System.out.println("O valor é: " + status);

        if (status) {
            System.out.println("Isso vai ser impresso?");
        }

        status = (10 > 9);
        if (status == true) {
            System.out.println("Isso é redundante!");
        }
        System.out.println("10 é maior que 9: " + (10 > 9));



        char ch = 'X';
        System.out.println("variavel ch = " + ch);

    }
}
