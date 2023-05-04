package ru.teachmeskills.homework06;

import java.util.Scanner;

public class MainTask03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество купюр в банкомате номиналом 20:");
        int twenty = scanner.nextInt();
        System.out.println("Введите количество купюр в банкомате номиналом 50:");
        int fifty = scanner.nextInt();
        System.out.println("Введите количество купюр в банкомате номиналом 100:");
        int hundred = scanner.nextInt();

        CashDispenser cashDispenser = new CashDispenser(twenty, fifty, hundred);

        System.out.println("Введите сумму для снятия:");
        int cash = scanner.nextInt();

        if (cashDispenser.CheckAvailableBanknotes(cash)) {
            System.out.println("Операция удалась");
        } else {
            System.out.println("Операция не удалась");
        }
    }
}
