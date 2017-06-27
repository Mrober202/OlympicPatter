package com.example.michaelrobertson.athletelabsolid;

/**
 * Created by michaelrobertson on 27/06/2017.
 */

public class Boxer extends Athlete {

    private int totalDistance = 0;


    public String prepare() {
        return ("Currently in the gym");
    }

    public String awardMedal(int num1, int num2) {
        int points = num1 - num2;
        if (points > 4 && points <= 9) {
            return "Bronze";
        }
        if (points > 9 && points <= 14) {
            return "Silver";
        }
        if (points >= 15) {
            return "Gold";
        }
        return "SHIIIITE";
    }

    public int distanceRan(int distance) {
        totalDistance += distance;
        System.out.println(" Boxer Session distance " + distance);
        System.out.println("Boxer has ran a total of " + totalDistance + " miles");
        return totalDistance;
    }
}
