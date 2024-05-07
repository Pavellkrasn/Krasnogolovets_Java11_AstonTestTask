package org.example;

import java.util.Scanner;

public class SecondTask {
    String a;
    String b;

    SecondTask(Scanner scanner) {
        try {
            System.out.println("Введите первую строку: ");
            this.a = scanner.nextLine();
            System.out.println("Введите вторую строку: ");
            this.b = scanner.nextLine();


            if (a.equals(b)) {
                System.out.println("Строки идентичны");
            } else {
                System.out.println("Строки неидентичны");
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    SecondTask(String firstText, String secondText) {
        try {

            this.a = firstText;
            this.b = secondText;

            if (a.equals(b)) {
                System.out.println("Строки идентичны");
            } else {
                System.out.println("Строки неидентичны");
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

    }

}