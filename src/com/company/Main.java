package com.company;

import java.util.Arrays;

public class Main {



    public static void main(String[] args) {
        int[] arr = generateRandomArray();

        // Задача 1

        int summ = 0;
        for (int a = 0; a < arr.length; a++) {
            summ += arr [a];
        }
        System.out.println("Сумма трат за месяц составила " + summ + " рублей");

        // Задача 2

        int min = Arrays.stream(arr)
                .min().getAsInt();
        int max = Arrays.stream(arr)
                .max().getAsInt();
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max +  "рублей");

        // Задача 3

        double medianSumm = summ / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + medianSumm + " руюлей");

        // Задача 4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i > 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.print(reverseFullName[0]);

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;



    }
}
