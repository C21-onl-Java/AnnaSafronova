package ru.teachmeskills.homework08.task01;

import ru.teachmeskills.homework08.task01.Phone;

public class Main {
    public static void main(String[] args) {
        Phone phone01 = new Phone(555000, "Samsung", 200);
        Phone phone02 = new Phone(666000, "Apple", 180);
        Phone phone03 = new Phone(777000, "Xiaomi", 210);

        System.out.println(phone01);
        System.out.println("\n" + phone02);
        System.out.println("\n" + phone03);

        System.out.println();
        phone01.receiveCall();
        System.out.println();
        phone01.receiveCall(888000, "Huawei");
    }
}
