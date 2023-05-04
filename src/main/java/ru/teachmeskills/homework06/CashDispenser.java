package ru.teachmeskills.homework06;

public class CashDispenser {
    private int amountTwenty;
    private int amountFifty;
    private int amountHundred;

    public CashDispenser(int twenty, int fifty, int hundred) {
        amountTwenty = twenty;
        amountFifty = fifty;
        amountHundred = hundred;
    }

    public boolean CheckAvailableBanknotes(int cash) {
        if (cash <= (amountTwenty * 20) + (amountFifty * 50) + (amountHundred * 100)) {
            int delOperation100 = cash % 100;
            int delOperation50 = delOperation100 % 50;
            int delOperation20 = delOperation50 % 20;

            if (delOperation20 == 0) {
                ReceiveMoney(cash);
                return true;
            } else {
                System.out.println("Невозможно разменять");
                return false;
            }
        } else {
            System.out.println("Недостаточно денег");
            return false;
        }
    }

    public void ReceiveMoney(int cash) {
        int amountHundredToReceive = 0;
        int amountFiftyToReceive = 0;
        int amountTwentyToReceive = 0;

        for (int k = 0; k <= amountHundred && cash >= 100; k++) {
            cash -= 100;
            amountHundred--;
            amountHundredToReceive++;
        }

        for (int j = 0; j <= amountFifty && cash >= 50; j++) {
            cash -= 50;
            amountFifty--;
            amountFiftyToReceive++;
        }

        for (int i = 0; i <= amountTwenty && cash >= 20; i++) {
            cash -= 20;
            amountTwenty--;
            amountTwentyToReceive++;

        }

        System.out.println("Сумма выдана:\n" +
                amountHundredToReceive + " купюр по 100\n" +
                amountFiftyToReceive + " купюр по 50\n" +
                amountTwentyToReceive + " купюр по 20");
    }
}
