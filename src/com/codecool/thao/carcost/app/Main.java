package com.codecool.thao.carcost.app;

import com.codecool.thao.carcost.DriverBankAccount;
import com.codecool.thao.carcost.carcost.Benzin;
import com.codecool.thao.carcost.carcost.Diesel;
import com.codecool.thao.carcost.carcost.Villany;

public class Main {
    public static void main(String[] args) {
        DriverBankAccount driverBankAccount = new DriverBankAccount();

        driverBankAccount.addCar(new Benzin(125, 3500, 8, 6500));
        driverBankAccount.addCar(new Diesel(1500,1900, 5));
        driverBankAccount.addCar(new Villany(38, 4500, 1750));

        driverBankAccount.simulate();
    }
}
