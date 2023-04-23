package ru.teachmeskills.homework06;

public class Computer {
    private int cost;
    private String model;
    private Ram ram;
    private Hdd hdd;

    public Computer(int cost, String model) {
        this.cost = cost;
        this.model = model;
        ram = new Ram();
        hdd = new Hdd();
    }

    public Computer(int cost, String model, Ram ram, Hdd hdd) {
        this.cost = cost;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    public String ToString() {
        return "Стоимость: " + cost + " рублей" + "\nМодель: " + model + "\nОперативная память: " + ram.ToString() + "\nЖесткий диск: " + hdd.ToString();
    }
}
