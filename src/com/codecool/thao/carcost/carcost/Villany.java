package com.codecool.thao.carcost.carcost;

public class Villany extends CarCost {
    private int akkuKapacitas;
    private int teljesitmeny;

    public Villany(int traveledDistance, int akkuKapacitas, int teljesitmeny) {
        super(traveledDistance);
        this.akkuKapacitas = akkuKapacitas;
        this.teljesitmeny = teljesitmeny;
    }

    @Override
    public int felelossegBiztositas() {
        this.felelossegBiztositasKtg = (1000 + akkuKapacitas);
        return this.felelossegBiztositasKtg;
    }

    @Override
    public int uzemanyag() {
        this.uzemanyagKtg = (2*teljesitmeny);
        return this.uzemanyagKtg;
    }

    @Override
    public int karbantartas() {
        this.karbantartasKtg = 500;
        return this.karbantartasKtg;
    }
}
