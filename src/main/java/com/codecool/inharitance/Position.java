package com.codecool.inharitance;

public class Position {
    private int x;
    private int y;

    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setPosition(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void printPosition(){
        System.out.println("moja pozycja to: ("+x+", "+y+")");
    }

}
