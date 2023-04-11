package ru.teachmeskills.homework03;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args)
    {
        System.out.println("Введите: \n1 - сезоны switch-case" +
                "\n2 - сезоны if-else" +
                "\n3 - четность введеных чисел" +
                "\n4 - температура" +
                "\n5 - радуга" +
                "\n6 - нечетные цифры от 1 до 99" +
                "\n7 - числа от 5 до 1" +
                "\n8 - сумма чисел от 1 до введеного" +
                "\n9 - умножение 7" +
                "\n10 - 10 отрицательных чисел с шагом в -5" +
                "\n11 - квадрат чисел от 10 до 20" +
                "\n12 - 11 чисел Фибоначчи" +
                "\n13 - вклад на 7%" +
                "\n14 - таблица умножения");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        switch (userInput)
        {
            case 1:
                System.out.print("Введите номер месяца: ");
                userInput = scanner.nextInt();

                switch (userInput)
                {
                    case 12:
                    case 1:
                    case 2:
                        System.out.println(userInput + " это зимний месяц");
                        break;
                    case 3:
                    case 4:
                    case 5:
                        System.out.println(userInput + " это весенний месяц");
                        break;
                    case 6:
                    case 7:
                    case 8:
                        System.out.println(userInput + " это летний месяц");
                        break;
                    case 9:
                    case 10:
                    case 11:
                        System.out.println(userInput + " это осенний месяц");
                        break;
                    default:
                        System.out.println("Такого месяца нет");
                        break;
                }
                break;

            case 2:
                System.out.print("Введите номер месяца: ");
                userInput = scanner.nextInt();

                if(userInput == 12 || userInput == 1 || userInput == 2)
                {
                    System.out.println(userInput + " это зимний месяц");
                }
                else if (userInput >= 3 && userInput <= 5)
                {
                    System.out.println(userInput + " это весенний месяц");
                }
                else if (userInput >= 6 && userInput <= 8)
                {
                    System.out.println(userInput + " это летний месяц");
                }
                else if (userInput >= 9 && userInput <= 11)
                {
                    System.out.println(userInput + " это осенний месяц");
                }
                else
                {
                    System.out.println("Такого месяца нет");
                }
                break;

            case 3:
                System.out.print("Введите число: ");
                userInput = scanner.nextInt();

                if (userInput % 2 == 0)
                {
                    System.out.println("Это четное число");
                }
                else
                {
                    System.out.println("Это нечетное число");
                }
                break;

            case 4:
                System.out.print("Введите температуру: ");
                userInput = scanner.nextInt();

                if(userInput > - 5)
                {
                    System.out.println("Теплая погода");
                }
                else if(userInput <= - 5 && userInput >= - 20)
                {
                    System.out.println("Нормальная погода");
                }
                else
                {
                    System.out.println("Холодная погода");
                }
                break;

            case 5:
                System.out.print("Введите номер от 1 до 7, чтобы узнать цвет: ");
                userInput = scanner.nextInt();

                switch (userInput)
                {
                    case 1:
                        System.out.println("Это красный цвет");
                        break;

                    case 2:
                        System.out.println("Это оранжевый цвет");
                        break;

                    case 3:
                        System.out.println("Это желтый цвет");
                        break;

                    case 4:
                        System.out.println("Это зеленый цвет");
                        break;

                    case 5:
                        System.out.println("Это голубой цвет");
                        break;

                    case 6:
                        System.out.println("Это синий цвет");
                        break;

                    case 7:
                        System.out.println("Это фиолетовый цвет");
                        break;

                    default:
                        System.out.println("Недопустимый номер");
                        break;
                }
                break;

            case 6:

                for(int i = 1; i <= 99; i += 2)
                {
                    System.out.print(i + " ");
                }
                break;

            case 7:

                for(int i = 5; i >= 1; i--)
                {
                    System.out.print(i + " ");
                }
                break;

            case 8:
                System.out.print("Введите положительное число: ");
                userInput = scanner.nextInt();
                int totalNumber = 0;

                if(userInput > 1)
                {
                    for(int i = 1; i < userInput; i++)
                    {
                        totalNumber += i;
                    }

                    System.out.println(totalNumber);
                }
                else
                {
                    System.out.println("Недопустимое число");
                }
                break;

            case 9:
                int number = 0;

                while (number < 98)
                {
                    number += 7;
                    System.out.print(number + " ");
                }
                break;

            case 10:
                number = 0;

                for(int i = 0; i < 10; i++)
                {
                    System.out.print(number + " ");
                    number -= 5;
                }
                break;

            case 11:

                for(int i = 10; i <= 20; i++)
                {
                    System.out.println(i + " - " + i * i);
                }
                break;

            case 12:
                int a = 0;
                int b = 1;
                int c;

                System.out.print(a + " " + b);

                for(int i = 0; i < 9; i++)
                {
                    c = a + b;
                    System.out.print(" " + c);
                    a = b;
                    b = c;
                }
                break;

            case 13:
                System.out.print("Введите сумму вклада: ");
                float amount = scanner.nextFloat();
                float percent = 0.07F;
                System.out.print("Введите количество месяцев: ");
                userInput = scanner.nextInt();

                for(int i = 0; i < userInput; i++)
                {
                    amount = amount + (amount * percent);
                    System.out.println("Сумма вклада: " + amount + " за " + i + " месяц");
                }
                break;

            case 14:

                for(int i = 1; i < 10; i++)
                {
                    for(int j = 1; j < 10; j++)
                    {
                        System.out.println(i + " * " + j + " = " + i * j);
                    }

                    System.out.println();
                }
                break;

            default:
                System.out.println("Такой задачи нет");
                break;
        }
    }
}