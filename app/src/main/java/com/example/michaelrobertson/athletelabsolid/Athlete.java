package com.example.michaelrobertson.athletelabsolid;

/**
 * Created by michaelrobertson on 27/06/2017.
 */

public abstract class Athlete{

    private int num1;
    private int num2;


    public void enterEvent() {
        prepare();
        compete();
    }

    public abstract String prepare();

    public String compete() {
        return "Ready to compete";
    }

    public abstract String awardMedal(int num1, int num2);

    public abstract int distanceRan(int distance);
}
