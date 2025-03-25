package org.example.arrays.exemplo;

public class LengthDemo {
    public static void main(String[] args) {
        int[] list = new int[10];
        int[][] table = new int[3][4];

        System.out.println("O tamanho da lista é: " + list.length);
        System.out.println("O número de arrays em table(primeira dimenção): " +
                table.length);
        System.out.println("O tamanho da table[0] é: " + table[0].length);

        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }

    }
}
