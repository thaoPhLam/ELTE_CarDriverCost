package com.codecool.thao.carcost.carcost;

public abstract class CarCost {
    protected int numOfMonths = 3;
    protected int traveledDistance;
    protected int koltseg;

    public CarCost(int traveledDistance) {
        this.traveledDistance = traveledDistance;
    }

    protected int felelossegBiztositasKtg = 0;
    protected int uzemanyagKtg = 0;
    protected int karbantartasKtg = 0;

    public abstract int felelossegBiztositas();
    public abstract int uzemanyag();
    public abstract int karbantartas();

    public void ktg() {
        koltseg = numOfMonths * (karbantartas() + felelossegBiztositas() / 12) + uzemanyag() * traveledDistance / 100;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "koltseg=" + koltseg +
                '}';
    }
}
