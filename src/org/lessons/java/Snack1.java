package org.lessons.java;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Il numero inserito è pari: " + number);
        } else {
            System.out.println("Il numero inserito è dispari. Il numero successivo è: " + (number + 1));
        }

        scanner.close();
    }
}