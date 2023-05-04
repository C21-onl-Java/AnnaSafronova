package ru.teachmeskills.homework07.task03;

import java.util.Date;

public abstract class Contract {
    private int number;
    private Date date;

    public Contract(int number, Date date) {
        this.number = number;
        this.date = date;
    }

    public int getNumber() {
        return number;
    }

    public Date getDate() {
        return date;
    }
}
