package ru.teachmeskills.homework08.task01;

public class Phone {
    private int number;
    private String name;
    private int weight;

    public Phone() {
    }

    public Phone(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public Phone(int number, String name, int weight) {
        this.number = number;
        this.name = name;
        this.weight = weight;
    }

    public void receiveCall() {
        System.out.println("На телефон " + this.name + " анонимный звонок");
    }

    public void receiveCall(int number, String name) {
        System.out.println("На телефон " + this.name + " звонит " + name + " " + number);
    }

    public String toString() {
        return "Имя: " + name + "\nНомер: " + number + "\nВес: " + weight + " грамм";
    }
}
