package org.lessons.java;

public class Snack3 {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                sum += numbers[i];
            }
        }

        System.out.println("La somma dei numeri dispari da 1 a 20 è: " + sum);
    }
}
