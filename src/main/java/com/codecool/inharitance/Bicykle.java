package com.codecool.inharitance;

public class Bicykle {
    public int cadence;
    public int gear;
    public int speed;

    private String name;

    public Bicykle(int startCadence, int startSpeed, int startGear){
        gear= startGear;
        speed = startSpeed;
        cadence = startCadence;
        name = "Rower";
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void go(){
        System.out.println("ziuu");
    }

    public void go(String alternativeSound){
        System.out.println(alternativeSound);
    }

    public String go(String prefixOfAlternativeSound, String postfixOfAlternativeSound) {
        return prefixOfAlternativeSound + postfixOfAlternativeSound;
    }

    public void go(int howManyUs){
        String sound = "si";
        for(int i = 0 ; i< howManyUs; i++){
            sound+="u";
        }
        System.out.println(sound);
    }
}
