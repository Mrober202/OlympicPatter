package com.example.michaelrobertson.athletelabsolid;

/**
 * Created by michaelrobertson on 27/06/2017.
 */

public class Gymnast extends Athlete {

    int totalDistance = 0;

    public String prepare() {
        return ("Currently working out routines");
    }

    public String awardMedal(int num1, int num2) {
        int points = num1 + num2;
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
        System.out.println(" Gymnast Session distance " + distance);
        System.out.println("Gymnast has ran " + totalDistance + " miles");
        return totalDistance;
    }
    }

