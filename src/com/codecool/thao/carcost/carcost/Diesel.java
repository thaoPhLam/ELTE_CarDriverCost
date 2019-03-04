package com.codecool.thao.carcost.carcost;

public class Diesel extends CarCost {
    private int loketTerfogat;
    private int hengerSzam;

    public Diesel(int traveledDistance, int loketTerfogat, int hengerSzam) {
        super(traveledDistance);
        this.loketTerfogat = loketTerfogat;
        this.hengerSzam = hengerSzam;
    }

    @Override
    public int felelossegBiztositas() {
        this.felelossegBiztositasKtg = (1700 + hengerSzam / 10);
        return this.felelossegBiztositasKtg;
    }

    @Override
    public int uzemanyag() {
        this.uzemanyagKtg = loketTerfogat;
        return this.uzemanyagKtg;
    }

    @Override
    public int karbantartas() {
        this.karbantartasKtg = (250 + hengerSzam * 7);
        return this.karbantartasKtg;
    }
}
