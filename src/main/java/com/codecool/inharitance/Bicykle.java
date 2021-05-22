package com.codecool.inharitance;

public class Bicykle {
    public int cadence;
    public int gear;
    public int speed;

    public Bicykle(int startCadence, int startSpeed, int startGear){
        gear= startGear;
        speed = startSpeed;
        cadence = startCadence;
    }
    public void go(){
        System.out.println("ziuu");
    }
}
