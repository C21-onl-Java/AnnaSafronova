package ru.teachmeskills.homework07.task03;

import java.util.Date;

public class ContractEmployee extends Contract {
    private Date finishDate;
    private String name;

    public ContractEmployee(int number, Date finishDate, String name){
        super(number, new Date());
        this.finishDate = finishDate;
        this.name = name;
    }

    public String toString() {
        return "Дата окончания: " + finishDate + "\nИмя сотрудника: " + name;
    }
}
