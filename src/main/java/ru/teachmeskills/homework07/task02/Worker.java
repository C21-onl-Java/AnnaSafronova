package ru.teachmeskills.homework07.task02;

public class Worker implements Name{
    private String name;
    final private String POST = "Рабочий";

    public Worker (String name) {
        this.name = name;
    }
    @Override
    public void printName() {
        System.out.println("Меня зовут " + name + ". Я " + POST);
    }
}
