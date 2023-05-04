package ru.teachmeskills.homework07.task03;

import java.util.Date;

public class ContractConsignment extends Contract{
    private int departmentСode;
    private int finalSum;

    public ContractConsignment(int number, int departmentСode, int finalSum) {
        super(number, new Date());
        this.departmentСode = departmentСode;
        this.finalSum = finalSum;
    }

    public String toString() {
        return "Код департамента: " + departmentСode + "\nИтоговая сумма за месяц: " + finalSum;
    }
}
