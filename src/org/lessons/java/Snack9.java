package org.lessons.java;

public class Snack9 {
    public static void main(String[] args) {
        int sum = 0;
        double average = 0.0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
        }

        average = sum / 10.0;

        System.out.println("La somma dei numeri è: " + sum);
        System.out.println("La media dei numeri è: " + average);
    }
}
