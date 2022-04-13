package com.company;

public class Main {

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("Task 1");
        int [] ledger = generateRandomArray();
        int sum = 0;
        for (int j : ledger) {
            sum = sum + j;
        }
        System.out.println("Monthly spending amount is " + sum);
        System.out.println("----");

        System.out.println("Task 2");
        int maxSpending = 99_999; // значиение, ниже минимального значения в массиве
        int minSpending = 200_001; // знрачение, выше максимального занчения в массиве
        for (int j : ledger) {
            if (j > maxSpending) {
                maxSpending = j;
            }
            if (j < minSpending) {
                minSpending = j;
            }
        }
        System.out.println("The max day spending was "+ maxSpending);
        System.out.println("The min day spending was " + minSpending);
        System.out.println("----");

        System.out.println("Task 3");
        float numberOfDays = 30f;
        float averageSum = sum / numberOfDays;
        System.out.println("The average amount spent a month was " + averageSum + " rubles");
        System.out.println("----");

        System.out.println("Task 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0 ; i--){
            System.out.print(reverseFullName[i]);
        }
    }
}