package com.codecool.thao.carcost;

import com.codecool.thao.carcost.carcost.CarCost;

import java.util.ArrayList;
import java.util.List;

public class DriverBankAccount {
    private List<CarCost> carCosts = new ArrayList<>();

    public void addCar(CarCost carCost) {
        carCosts.add(carCost);
    }

    public void simulate() {
        for (CarCost carcost : carCosts) {
            carcost.ktg();
            System.out.println(carcost);
        }
    }
}
