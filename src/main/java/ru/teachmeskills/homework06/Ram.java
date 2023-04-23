package ru.teachmeskills.homework06;

public class Ram {
    private String name;
    private int amount;

    public Ram() {
    }

    public Ram(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String ToString() {
        return "Название: " + name + " | Объем: " + amount + " Гб";
    }
}
