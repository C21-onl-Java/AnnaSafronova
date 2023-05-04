package ru.teachmeskills.homework07.task02;

public class Accountant implements Name{
    private String name;
    final private String POST = "Бухгалтер";

    public Accountant (String name) {
        this.name = name;
    }
    @Override
    public void printName() {
        System.out.println("Меня зовут " + name + ". Я " + POST);
    }
}
