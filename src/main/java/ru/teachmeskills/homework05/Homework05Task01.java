package ru.teachmeskills.homework05;

import java.util.Random;
import java.util.Scanner;

public class Homework05Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите количество строк: ");
        int row = scanner.nextInt();
        System.out.print("Введите количество столбцов: ");
        int column = scanner.nextInt();
        System.out.print("Введите глубину массива: ");
        int depth = scanner.nextInt();
        int[][][] array = new int[row][column][depth];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                for (int k = 0; k < depth; k++) {
                    array[i][j][k] = random.nextInt(10);
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.print("Введите на сколько увеличить каждый элемент массива: ");
        int increase = scanner.nextInt();
        System.out.println();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                for (int k = 0; k < depth; k++) {
                    array[i][j][k] += increase;
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
