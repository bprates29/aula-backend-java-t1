package org.example.service;

public class CharDemo {
    public static void main(String[] args) {
        char ch = 'X';
        System.out.println("variável ch = " + ch);

        ch++;
        System.out.println("variável ch = " + ch);

        ch = 90;
        System.out.println("variável ch = " + ch);


        for (int i = 0; i < 500; i++) {
            System.out.println(i + " = " + (char)i);
        }

    }

}
