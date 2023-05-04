package ru.teachmeskills.homework07.task02;

public class MainTask02 {
    public static void main(String[] args) {
        Director director = new Director("Светлана");
        Worker worker = new Worker("Василий");
        Accountant accountant = new Accountant("Елизавета");

        director.printName();
        worker.printName();
        accountant.printName();
    }
}
