package com.codecool.inharitance;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world :)");
        Bicykle bicykle = new Bicykle(90, 45, 5);
        MountainBike mountainBike = new MountainBike(90, 45, 5);
        TriathlonBike triathlonBike = new TriathlonBike(90, 55, 3);

        Bicykle anAnotherBicykle = new TriathlonBike(90, 45, 5);

        System.out.println("to jest wartosc z tego uniwersalnego/another Bike'a: " +((TriathlonBike) anAnotherBicykle).getHasLemondka());


        bicykle.go();
        System.out.println(bicykle.getName());
        mountainBike.go();
        System.out.println(mountainBike.getName());
        triathlonBike.go();
        System.out.println(triathlonBike.getName());
        triathlonBike.go("siuuuuu");
        triathlonBike.go("si", "uuuuuuuuuuuuuuuu");
        triathlonBike.go(33);
        mountainBike.go(33);
        triathlonBike.printPosition();

        Util.printBikeName(triathlonBike);
        
    }
}
