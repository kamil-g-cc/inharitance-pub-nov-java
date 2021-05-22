package com.codecool.inharitance;

public class TriathlonBike extends Bicykle{
    public boolean hasLemondka;
    public TriathlonBike(int startCadence, int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        hasLemondka = true;
        setName("Rower triathlonowy");
    }

    @Override
    public void go() {
        System.out.println("ziuuuuuuuuuuuuu");
    }
}
