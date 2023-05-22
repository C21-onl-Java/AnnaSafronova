package ru.teachmeskills.homework09;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите количество векторов: ");
        int countVectors = scanner.nextInt();

        Vector2D[] array = new Vector2D[countVectors];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Vector2D(random.nextInt(10), random.nextInt(20));
            System.out.println(array[i].toString());
        }

        Vector3D vector3D01 = new Vector3D(2,4, 3);
        Vector3D vector3D02 = new Vector3D(4,6, 1);
        Vector3D vector3D03 = new Vector3D(2,5, 3);

        Vector3D[] vectors3D = {vector3D01, vector3D02, vector3D03};

        System.out.println();
        vector3D01.sumVectorLength(vectors3D);
    }
}
