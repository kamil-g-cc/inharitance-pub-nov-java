package com.codecool.inharitance;

public class Bicykle {
    public int cadence;
    public int gear;
    public int speed;

    private final Position position;

    private String name;

    public Bicykle(int startCadence, int startSpeed, int startGear){
        gear= startGear;
        speed = startSpeed;
        cadence = startCadence;
        name = "Rower";
        position = new Position(0, 0);
        position.setPosition(2, 3);
        //position = new Position(3, 3);
    }

    public String getName() {
        return name;
    }

    public void printPosition(){
        if(position == null){
            System.out.println("sorry, I don't have position set yet");
        } else {
            position.printPosition();
        }
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
