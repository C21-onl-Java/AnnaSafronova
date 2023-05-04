package ru.teachmeskills.homework06;

public class Hdd {
    private String name;
    private int amount;
    private String type;

    public Hdd() {
    }

    public Hdd(String name, int amount, String type) {
        this.name = name;
        this.amount = amount;
        this.type = type;
    }

    public String ToString() {
        return "Название: " + name + " | Объем: " + amount + " Гб" + " | Тип: " + type;
    }
}
