package org.example; //DO NOT DELETE
import java.util.Scanner;
/*
 * Program Name: Gallon Converter
 * Author: Christina Zhou
 */
class Main {
    public static void main(String[] args){
        //Start code here
        double gallons;
        double quarts;
        double pints;
        double cups;
        double tablespoons;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of gallons: ");
        gallons = input.nextDouble();
        input.close();
        System.out.println("In " + gallons + " gallons there are: ");
        quarts = gallons * 4;
        pints = quarts * 2;
        cups = pints * 2;
        tablespoons = cups * 16;
        System.out.println(quarts + " quarts");
        System.out.println(pints + " pints");
        System.out.println(cups + " cups");
        System.out.println(tablespoons + " tablespoons");
    }
}