package ru.teachmeskills.homework08.task02;

public class Therapist extends Doctor {

    public Therapist() {
        this.specialty = "Терапевт";
    }

    public void heal() {
        System.out.println("Для лечения назначен: " + specialty);
    }
}
