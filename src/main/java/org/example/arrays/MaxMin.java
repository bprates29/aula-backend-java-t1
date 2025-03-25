package org.example.arrays;

public class MaxMin {
    public static void main(String[] args) {
        int[] nums = { 99, -10, 100025, 18, -999, 567, 46, -6, 23, -1 };

        int min = nums[0];
        int max = nums[0];

        for (int i = 1; i < 10; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }

        System.out.println("Minimo: " + min);
        System.out.println("Maximo: " + max);
    }
}
