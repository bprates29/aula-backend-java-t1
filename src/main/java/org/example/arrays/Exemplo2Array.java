package org.example.arrays;

public class Exemplo2Array {
    public static void main(String[] args) {
        int[] samble;
        samble = new int[10];
        var primeiro = samble[0];
        var ultimo= samble[9];

        for(int i = 0; i < 10; i++) {
            samble[i] = i+50;
        }

        for(int i = 0; i < 10; i++) {
            System.out.println("samble[" + i + "] = " + samble[i]);
        }
    }
}
