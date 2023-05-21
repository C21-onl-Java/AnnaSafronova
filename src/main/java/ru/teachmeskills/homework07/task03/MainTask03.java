package ru.teachmeskills.homework07.task03;

import java.util.*;

public class MainTask03 {
    public static void main(String[] args) {
        final int ADDCONTRACTSUPPLYGOODS = 1;
        final int ADDCONTRACTEMPLOYEE = 2;
        final int ADDCONSIGNMENT = 3;
        final int SHOWDOCMENTS = 4;
        final int EXIT = 5;

        Scanner scanner = new Scanner(System.in);
        Register register = new Register();

        boolean isWorking = true;

        while (isWorking) {
            System.out.println("1 - Добавить контракт на поставку товаров " +
                    "\n2 - Добавить контракт с сотрудником " +
                    "\n3 - Добавить финансовую накладную " +
                    "\n4 - Посмотреть все документы " +
                    "\n5 - Выход " +
                    "\nВведите: ");

            int userInput = scanner.nextInt();

            switch (userInput) {
                case ADDCONTRACTSUPPLYGOODS:
                    addContract(ADDCONTRACTSUPPLYGOODS, register);
                    break;
                case ADDCONTRACTEMPLOYEE:
                    addContract(ADDCONTRACTEMPLOYEE, register);
                    break;
                case ADDCONSIGNMENT:
                    addContract(ADDCONSIGNMENT, register);
                    break;
                case SHOWDOCMENTS:
                    register.showContracts();
                    break;
                case EXIT:
                    isWorking = false;
                    break;
                default:
                    System.out.println("Неверная команда");
                    break;
            }
        }
    }

    public static void addContract(int userInput, Register register) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Calendar calendar = Calendar.getInstance();
        Date finishDate;

        if (userInput == 1) {
            System.out.println("Введите тип товара: ");
            String type = scanner.nextLine();
            System.out.println("Введите количество товара: ");
            int count = scanner.nextInt();
            register.addContractSupplyGoods(random.nextInt(1000), type, count);

        } else if (userInput == 2) {
            System.out.println("Введите имя сотрудника: ");
            String name = scanner.nextLine();
            System.out.println("Введите количество месяцев на сколько заключен контракт: ");
            int addMonth = scanner.nextInt();
            calendar.add(Calendar.MONTH, addMonth);
            finishDate = calendar.getTime();
            register.addContractEmployee(random.nextInt(1000), finishDate, name);
        } else if (userInput == 3) {
            System.out.println("Код департамента: ");
            int departmentСode = scanner.nextInt();
            System.out.println("Итоговая сумма за месяц: ");
            int finalSum = scanner.nextInt();
            register.addContractConsignment(random.nextInt(1000), departmentСode, finalSum);
        }
    }
}
