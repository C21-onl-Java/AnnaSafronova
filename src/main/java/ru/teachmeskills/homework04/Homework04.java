package ru.teachmeskills.homework04;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Homework04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int userInput;
        int sizeNewArray;
        int j;
        int arraySize;
        boolean isNumberExist;

        System.out.print("1 - проверить входит заданное числов в массив или нет" +
                "\n2 - удалить заданное число из массива" +
                "\n3 - массив с пользовательским размером, вывод мин, макс и среднего значения" +
                "\n4 - сравнение среднего арифмитического двух массивов" +
                "\n5 - массив размерностью от 5 до 10 пользовательского ввода" +
                "\n6 - элемент нечетного индекса массива равен 0" +
                "\n7 - сортировка массива имен" +
                "\n8 - сортировка массива пузырьком" +
                "\nВведите номер задачи: ");
        userInput = scanner.nextInt();

        switch (userInput) {

            case 1:
                arraySize = 10;
                int[] arrayCase01 = new int[arraySize];
                isNumberExist = true;

                for (int i = 0; i < arrayCase01.length; i++) {
                    arrayCase01[i] = random.nextInt(6);
                    System.out.print(arrayCase01[i] + " ");
                }

                System.out.print("\nВведите число для проверки наличия в массиве: ");
                userInput = scanner.nextInt();

                for (int number : arrayCase01) {
                    if (userInput == number) {
                        System.out.println("Это число присутствует в массиве");
                        isNumberExist = false;
                        break;
                    }
                }

                if (isNumberExist) {
                    System.out.println("Такого числа нет в массиве");
                }

                break;

            case 2:
                arraySize = 10;
                int[] arrayCase02 = new int[arraySize];
                int[] tempArrayCase02 = new int[arraySize];
                isNumberExist = false;

                for (int i = 0; i < arrayCase02.length; i++) {
                    arrayCase02[i] = random.nextInt(6);
                    System.out.print(arrayCase02[i] + " ");
                }

                System.out.print("\nВведите число для исключения из массива: ");
                userInput = scanner.nextInt();
                sizeNewArray = 0;
                j = 0;

                for (int i = 0; i < arrayCase02.length; i++) {
                    if (userInput != arrayCase02[i]) {
                        sizeNewArray++;
                        tempArrayCase02[j] = arrayCase02[i];
                        j++;
                    }
                    else if (userInput == arrayCase02[i]) {
                        isNumberExist = true;
                    }
                }

                if (isNumberExist) {
                    int[] newArrayCase02 = new int[sizeNewArray];
                    System.arraycopy(tempArrayCase02, 0, newArrayCase02, 0, sizeNewArray);
                    System.out.println();

                    for (int number : newArrayCase02) {
                        System.out.print(number + " ");
                    }
                } else {
                    System.out.println("Такого числа в массиве нет");
                }

                break;

            case 3:
                System.out.print("Введите размер массива: ");
                userInput = scanner.nextInt();

                int[] arrayCase03 = new int[userInput];

                for (int i = 0; i < arrayCase03.length; i++) {
                    arrayCase03[i] = (int) (Math.random() * 10);
                    System.out.print(arrayCase03[i] + " ");
                }

                Arrays.sort(arrayCase03);
                System.out.println();
                System.out.println(arrayCase03[0] + " - минимальное значение");
                System.out.println(arrayCase03[arrayCase03.length - 1] + " - максимальное значение");
                System.out.println((arrayCase03[0] + arrayCase03[arrayCase03.length - 1]) / 2 + " - среднее значение");

                break;

            case 4:
                arraySize = 5;
                int[] firstArrayCase04 = new int[arraySize];
                int[] secondArrayCase04 = new int[arraySize];
                float totalCountFirstArray = 0;
                float totalCountSecondArray = 0;
                float middleValueFirstArray;
                float middleValueSecondArray;

                for (int i = 0; i < firstArrayCase04.length; i++) {
                    firstArrayCase04[i] = random.nextInt(10);
                    System.out.print(firstArrayCase04[i] + " ");
                    totalCountFirstArray += firstArrayCase04[i];
                }

                middleValueFirstArray = totalCountFirstArray / firstArrayCase04.length;
                System.out.println("\nСреднее арифмитическое: " + middleValueFirstArray);

                for (int i = 0; i < secondArrayCase04.length; i++) {
                    secondArrayCase04[i] = random.nextInt(10);
                    System.out.print(secondArrayCase04[i] + " ");
                    totalCountSecondArray += secondArrayCase04[i];
                }

                middleValueSecondArray = totalCountSecondArray / secondArrayCase04.length;
                System.out.println("\nСреднее арифмитическое: " + middleValueSecondArray);

                if (middleValueFirstArray > middleValueSecondArray) {
                    System.out.println("Среднее арифмитическое первого массива больше второго");
                } else if (middleValueFirstArray < middleValueSecondArray) {
                    System.out.println("Среднее арифмитическое второго массива больше первого");
                } else {
                    System.out.println("Среднее арифмитическое перовго и второго равны");
                }

                break;

            case 5:

                do {
                    System.out.print ("Введите число 5 до 10: ");
                    userInput = scanner.nextInt();

                    if (userInput < 5 || userInput > 10) {
                        System.out.println("Неверно");
                    }

                } while (userInput < 5 || userInput > 10);

                int[] arrayCase05 = new int[userInput];
                sizeNewArray = 0;

                for (int i = 0; i < userInput; i++) {
                    arrayCase05[i] = random.nextInt(100);
                    System.out.print(arrayCase05[i] + " ");

                    if (arrayCase05[i] % 2 == 0) {
                        sizeNewArray++;
                    }
                }

                System.out.println("\nТолько четные числа из массива:");

                int[] newArray = new int[sizeNewArray];
                j = 0;

                for (int i = 0; i < userInput; i++) {
                    if (arrayCase05[i] % 2 == 0) {
                        newArray[j] = arrayCase05[i];
                        System.out.print(newArray[j] + " ");
                        j++;
                    }
                }

                break;

            case 6:
                arraySize = 10;
                int[] arrayCase06 = new int[arraySize];

                for (int i = 0; i < arrayCase06.length; i++) {
                    arrayCase06[i] = random.nextInt(10);
                    System.out.print(arrayCase06[i] + " ");
                }

                System.out.println();

                for (int i = 0; i < arrayCase06.length; i++) {
                    if (i % 2 != 0) {
                        arrayCase06[i] = 0;
                        System.out.print(arrayCase06[i] + " ");
                    } else {
                        System.out.print(arrayCase06[i] + " ");
                    }
                }

                break;

            case 7:
                String[] arrayCase07 = {"Наталья", "Лилия", "Анна", "Мария", "Анастасия", "Ольга", "Светлана"};
                Arrays.sort(arrayCase07);

                for (String name : arrayCase07) {
                    System.out.println(name);
                }
                break;

            case 8:
                arraySize = 10;
                int[] arrayCase08 = new int[arraySize];

                for (int i = 0; i < arrayCase08.length; i++) {
                    arrayCase08[i] = random.nextInt(10);
                    System.out.print(arrayCase08[i] + " ");
                }

                for (int i = 0; i < arrayCase08.length; i++) {
                    for (int k = i + 1; k < arrayCase08.length; k++) {
                        if (arrayCase08[i] > arrayCase08[k]) {
                            int tempNumber = arrayCase08[k];
                            arrayCase08[k] = arrayCase08[i];
                            arrayCase08[i] = tempNumber;
                        }
                    }
                }

                System.out.println();

                for (int number : arrayCase08) {
                    System.out.print(number + " ");
                }

                break;
        }
    }
}
