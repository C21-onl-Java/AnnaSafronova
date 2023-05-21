package ru.teachmeskills.homework08.task02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя пациента: ");
        Patient patient = new Patient(scanner.nextLine());
        System.out.print("Назначьте план лечения: ");
        int treatmentCode = scanner.nextInt();
        Treatment treatment = new Treatment(treatmentCode, patient);

        switch (treatmentCode) {
            case 1:
                treatment.assignDoctor(new Surgeon(), patient.getName());
                break;
            case 2:
                treatment.assignDoctor(new Dentist(), patient.getName());
                break;
            default:
                treatment.assignDoctor(new Therapist(), patient.getName());
                break;
        }
    }
}
