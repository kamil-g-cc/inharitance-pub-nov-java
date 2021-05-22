package com.codecool.inharitance;

public final class MountainBike extends Bicykle{
    public boolean hasDumper;
    public MountainBike(int startCadence, int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        hasDumper = true;
        //name = "Rower gorski";
        setName("Rower gorski");
    }

    @Override
    public void go() {
        System.out.println("ziu ziu ziu");
    }
}
