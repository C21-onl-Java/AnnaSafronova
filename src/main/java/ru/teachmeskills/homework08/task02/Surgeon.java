package ru.teachmeskills.homework08.task02;

public class Surgeon extends Doctor {

    public Surgeon() {
        this.specialty = "Хирург";
    }

    public void heal() {
        System.out.println("Для лечения назначен: " + specialty);
    }
}
