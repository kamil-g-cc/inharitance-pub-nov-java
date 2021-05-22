package com.codecool.inharitance;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world :)");
        Bicykle bicykle = new Bicykle(90, 45, 5);
        MountainBike mountainBike = new MountainBike(90, 45, 5);
        TriathlonBike triathlonBike = new TriathlonBike(90, 55, 3);
        bicykle.go();
        mountainBike.go();
        triathlonBike.go();
    }
}
