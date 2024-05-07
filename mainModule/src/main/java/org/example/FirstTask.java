package org.example;

import java.util.Scanner;

public class FirstTask {

    int a;
    int b;

    FirstTask(Scanner scanner) {
        try {

            System.out.println("Введите первое число: ");
            this.a = scanner.nextInt();
            System.out.println("Введите второе число: ");
            this.b = scanner.nextInt();

            if (a > b) {
                System.out.println(a + " > " + b);
            }
            if (a < b) {
                System.out.println(a + " < " + b);
            } else {
                System.out.println(a + " = " + b);
            }

            System.out.println("Разница введенных чисел: " + defference());
            System.out.println("Cумма введенных чисел: " + sum());
            System.out.println("Результат деления введенных чисел: " + delenie());
            System.out.println("Результат умножения введенных чисел: " + umnojenie());

        } catch (RuntimeException e) {
            e.printStackTrace();
        }


    }

    FirstTask(int a, int b) {
        try {


            this.a = a;
            this.b = b;

            if (a > b) {
                System.out.println(a + " > " + b);
            }
            if (a < b) {
                System.out.println(a + " < " + b);
            } else {
                System.out.println(a + " = " + b);
            }

            System.out.println("Разница введенных чисел: " + defference());
            System.out.println("Cумма введенных чисел: " + sum());
            System.out.println("Результат деления введенных чисел: " + delenie());
            System.out.println("Результат умножения введенных чисел: " + umnojenie());

        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }


    private int sum() {
        return a + b;
    }

    private float delenie() {
        return (float) a / b;
    }

    private int defference() {
        return a - b;
    }

    private int umnojenie() {
        return a * b;
    }

}