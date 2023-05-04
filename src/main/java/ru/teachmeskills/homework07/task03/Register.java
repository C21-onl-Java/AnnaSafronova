package ru.teachmeskills.homework07.task03;

import java.util.ArrayList;
import java.util.Date;

public class Register {
    private ArrayList<Contract> database = new ArrayList<>();

    public void addContractSupplyGoods(int number, String type, int count){
        database.add(new ContractSupplyGoods(number, type, count));
    }

    public void addContractEmployee(int number, Date finishDate, String name){
        database.add(new ContractEmployee(number, finishDate, name));
    }

    public void addContractConsignment(int number, int departmentСode, int finalSum){
        database.add(new ContractConsignment(number, departmentСode, finalSum));
    }

    public void showContracts() {
        for (Contract contract : database) {
            System.out.println("Номер контракта: " + contract.getNumber() + "\nДата создания: " + contract.getDate());
            System.out.println(contract);
            System.out.println();
        }
    }
}
