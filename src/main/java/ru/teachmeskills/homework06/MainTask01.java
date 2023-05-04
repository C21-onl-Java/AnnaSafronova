package ru.teachmeskills.homework06;

import java.util.ArrayList;
import java.util.Scanner;

public class MainTask01 {
    public static void main(String[] args) {
        final int ADDCARDS = 1;
        final int ADDMONEY = 2;
        final int WHITHDRAWMONEY = 3;
        final int EXIT = 4;

        Scanner scanner = new Scanner(System.in);
        ArrayList<CreditCard> creditCardList = new ArrayList<CreditCard>();
        boolean isWorking = true;
        int userInput;

        while (isWorking) {
            System.out.print("1 - добавить карты " +
                    "\n2 - положить сумму на счет " +
                    "\n3 - снять со счета " +
                    "\n4 - выход" +
                    "\nВведите номер команды: ");
            userInput = scanner.nextInt();

            switch (userInput) {
                case ADDCARDS:
                    CreateCard(creditCardList);
                    break;
                case ADDMONEY:
                    AddMoney(creditCardList);
                    break;
                case WHITHDRAWMONEY:
                    WithdrawMoney(creditCardList);
                    break;
                case EXIT:
                    isWorking = false;
                    break;
            }
        }
    }

    public static void CreateCard(ArrayList<CreditCard> creditCardList) {
        Scanner scanner = new Scanner(System.in);
        int countCards = 0;
        int totalCountCards = 3;
        int numberCard;
        int currentAmountMoney;

        while (countCards < totalCountCards) {

            System.out.print("Введите номер карты: ");
            numberCard = scanner.nextInt();
            System.out.print("Введите сумму на счету: ");
            currentAmountMoney = scanner.nextInt();

            if (currentAmountMoney > 0) {
                creditCardList.add(new CreditCard(numberCard, currentAmountMoney));
                countCards++;
            } else {
                System.out.println("Сумма может быть только положительной");
            }
        }
    }

    public static void AddMoney(ArrayList<CreditCard> creditCardList) {
        Scanner scanner = new Scanner(System.in);
        ShowInfo(creditCardList);
        System.out.println("Выберите порядковый номер карты для операции: ");
        int userInput = scanner.nextInt();
        System.out.println("Сколько внести: ");
        int sum = scanner.nextInt();

        creditCardList.get(userInput - 1).AddMoney(sum);
    }

    public static void WithdrawMoney(ArrayList<CreditCard> creditCardList) {
        Scanner scanner = new Scanner(System.in);
        ShowInfo(creditCardList);
        System.out.println("Выберите порядковый номер карты для операции: ");
        int userInput = scanner.nextInt();
        System.out.println("Сколько снять: ");
        int sum = scanner.nextInt();

        if (sum <= creditCardList.get(userInput - 1).getCurrentAmountMoney()) {
            creditCardList.get(userInput - 1).WithdrawMoney(sum);
        } else {
            System.out.println("Недостаточно суммы на счету для проведения операции");
        }
    }

    public static void ShowInfo(ArrayList<CreditCard> creditCardList) {
        for (int i = 0; i < creditCardList.size(); i++) {
            System.out.println(i + 1 + " " + creditCardList.get(i).toString());
        }
    }
}
