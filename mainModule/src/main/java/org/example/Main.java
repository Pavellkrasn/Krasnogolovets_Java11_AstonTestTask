package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Реализация через параметры
        new FirstTask(1, 3);
        new SecondTask("qweqw", "qweqwe");

        //Реализация через консоль
        new FirstTask(new Scanner(System.in));
        new SecondTask(new Scanner(System.in));

        //Третье задание
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i : array) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}