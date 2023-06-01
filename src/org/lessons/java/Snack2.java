package org.lessons.java;

import java.util.Random;

public class Snack2 {
    public static void main(String[] args) {
        String[] names = { "John", "George", "Paul", "Ringo", "Claudio" };
        String[] surnames = { "Lennon", "Harrison", "McCartney", "Starr", "Lo Giudice" };

        Random random = new Random();

        System.out.println("Falsa lista di invitati:");

        for (int i = 0; i < 10; i++) {
            String randomName = names[random.nextInt(names.length)];
            String randomSurname = surnames[random.nextInt(surnames.length)];

            System.out.println(randomName + " " + randomSurname);
        }
    }
}
