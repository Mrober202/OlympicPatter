package com.example.michaelrobertson.athletelabsolid;

/**
 * Created by michaelrobertson on 27/06/2017.
 */

public class Runner {

    public static void main(String[] args) {

        Boxer boxer = new Boxer();
        Gymnast gymnast = new Gymnast();

        System.out.println("Boxer is: " + "" + boxer.prepare());
        System.out.println("Gymnast is: " + "" + gymnast.prepare());

        System.out.println("Boxer is " + "" + boxer.compete());
        System.out.println("Gymnast is " + "" + gymnast.compete());

        System.out.println("Boxer is awarded:");
        System.out.println(boxer.awardMedal(21, 13));


        System.out.println("Gymnast is awarded:");
        System.out.println(gymnast.awardMedal(9, 4));


        boxer.distanceRan(4);
        boxer.distanceRan(3);

        gymnast.distanceRan(2);
        gymnast.distanceRan(5);





    }
}
