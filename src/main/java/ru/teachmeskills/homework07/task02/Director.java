package ru.teachmeskills.homework07.task02;

public class Director implements Name{

    private String name;
    final private String POST = "Директор";

    public Director (String name) {
        this.name = name;
    }
    @Override
    public void printName() {
        System.out.println("Меня зовут " + name + ". Я " + POST);
    }
}
