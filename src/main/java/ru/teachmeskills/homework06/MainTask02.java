package ru.teachmeskills.homework06;

public class MainTask02 {
    public static void main(String[] args) {

        Computer computer01 = new Computer(50000, "HP 250 ZX");
        Ram ram = new Ram("Corsair Vengeance", 64);
        Hdd hdd = new Hdd("Samsung", 500, "внутренний");
        Computer computer02 = new Computer(100000, "ACER 4000 PLUS ULTRA", ram, hdd);
        System.out.println(computer01.ToString());
        System.out.println("\n***\n");
        System.out.println(computer02.ToString());
    }
}
