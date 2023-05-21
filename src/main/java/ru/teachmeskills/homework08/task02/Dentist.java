package ru.teachmeskills.homework08.task02;

public class Dentist extends Doctor {

    public Dentist() {
        this.specialty = "Дантист";
    }

    public void heal() {
        System.out.println("Для лечения назначен: " + specialty);
    }
}
