package org.lessons.java;

import java.util.Scanner;

public class Snack8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero di 4 cifre: ");
        int number = scanner.nextInt();

        int thousands = number / 1000 % 10;
        int hundreds = number / 100 % 10;
        int tens = number / 10 % 10;
        int units = number % 10;

        int sum = thousands + hundreds + tens + units;

        System.out.println("La somma delle cifre è: " + sum);

        scanner.close();
    }
}
