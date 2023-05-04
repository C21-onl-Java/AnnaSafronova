package ru.teachmeskills.homework06;

public class CreditCard {

    private int numberCard;
    private int currentAmountMoney;

    public CreditCard(int numberCard, int currentAmountMoney) {
        this.numberCard = numberCard;
        this.currentAmountMoney = currentAmountMoney;
    }

    public int getCurrentAmountMoney() {
        return currentAmountMoney;
    }

    public void AddMoney(int sum) {
        currentAmountMoney += sum;
    }

    public void WithdrawMoney(int sum) {
        currentAmountMoney -= sum;
    }

    public String toString() {
        return "Номер карты: " + numberCard + "\nТекущая сумма на карте: " + currentAmountMoney;
    }
}
