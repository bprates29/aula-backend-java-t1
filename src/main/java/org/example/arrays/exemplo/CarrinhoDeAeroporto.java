package org.example.arrays.exemplo;

public class CarrinhoDeAeroporto {
    public static void main(String[] args) {
        int[][] riders = new int[7][];
        int[][][] threeD = new int[4][5][6];

        for (int i = 0; i < 5; i++) {
            riders[i] = new int[10];
        }

        riders[5] = new int[2];
        riders[6] = new int[2];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                riders[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int j = 0; j < 2; j++) {
            riders[5][j] = 100 + j;
            riders[6][j] = 200 + j;
        }

        for (int i = 0; i < riders.length; i++) {
            System.out.print("Dia " + i + ": ");
            for (int j = 0; j < riders[i].length; j++) {
                System.out.print(riders[i][j] + " ");
            }
            System.out.println();
        }

    }
}
