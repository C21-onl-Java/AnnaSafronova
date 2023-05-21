package ru.teachmeskills.homework07.task03;

import java.util.Date;

public class ContractSupplyGoods extends Contract {
    private String type;
    private int count;

    public ContractSupplyGoods(int number, String type, int count) {
        super(number, new Date());
        this.type = type;
        this.count = count;
    }

    public String toString() {
        return "Тип контракта: " + type + "\nКоличество товаров: " + count;
    }
}
