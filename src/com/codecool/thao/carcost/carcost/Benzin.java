package com.codecool.thao.carcost.carcost;

public class Benzin extends CarCost {
    private int loketTerfogat;
    private int hengerSzam;
    private int maxFordulatszam;

    public Benzin(int traveledDistance, int loketTerfogat, int hengerSzam, int maxFordulatszam) {
        super(traveledDistance);
        this.loketTerfogat = loketTerfogat;
        this.hengerSzam = hengerSzam;
        this.maxFordulatszam = maxFordulatszam;
    }

    @Override
    public int felelossegBiztositas() {
        this.felelossegBiztositasKtg = (1500 + loketTerfogat / 2 + hengerSzam / 10);
        return this.felelossegBiztositasKtg;
    }

    @Override
    public int uzemanyag() {
        this.uzemanyagKtg = (maxFordulatszam + hengerSzam * 10 + loketTerfogat);
        return this.uzemanyagKtg;
    }

    @Override
    public int karbantartas() {
        this.karbantartasKtg = maxFordulatszam + hengerSzam * 10;
        return this.karbantartasKtg;
    }
}
