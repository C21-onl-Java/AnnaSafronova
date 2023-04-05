package ru.teachmeskills.homework02;

import java.util.Scanner;

public class Test02 {

    public static void main(String[] args) {
        System.out.print("Введите имя: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("Hello, " + text);
    }
}
