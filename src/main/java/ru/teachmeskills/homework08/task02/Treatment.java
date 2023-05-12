package ru.teachmeskills.homework08.task02;

public class Treatment {
    private int treatmentCode;

    private Patient patient;

    public Treatment(int treatmentCode, Patient patient) {
        this.treatmentCode = treatmentCode;
        this.patient = patient;
    }

    public int getTreatmentCode() {
        return treatmentCode;
    }

    public void assignDoctor(Doctor doctor, String namePatient) {
        System.out.println("Пациент: " + namePatient);
        System.out.println("План лечения: " + treatmentCode);
        doctor.heal();
    }
}
