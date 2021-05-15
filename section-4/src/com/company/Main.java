package com.company;

import static com.company.ex1_SpeedConverter.printConversion;
import static com.company.ex1_SpeedConverter.toMilesPerHour;
import static com.company.ex2_MegaBytesConverter.printMegaBytesAndKiloBytes;
import static com.company.ex3_BarkingDog.shouldWakeUp;
import static com.company.ex4_LeapYear.isLeapYear;
import static com.company.ex5_DecimalComparator.areEqualByThreeDecimalPlaces;
import static com.company.ex6_EqualSumChecker.hasEqualSum;

public class Main {

    public static void main(String[] args) {
	    // Exercise 1 - Speed Converter
/*
        System.out.println(toMilesPerHour(1.5)); //should return value 1
        System.out.println(toMilesPerHour(10.25)); //should return value 6
        System.out.println(toMilesPerHour(-5.6)); //should return value -1
        System.out.println(toMilesPerHour(25.42)); //should return value 16
        System.out.println(toMilesPerHour(75.114)); //should return value 47

        printConversion(1.5); // should print the following text (into the console - System.out): 1.5 km/h = 1 mi/h
        printConversion(10.25); // should print the following text (into the console - System.out): 10.25 km/h = 6 mi/h
        printConversion(-5.6); // should print the following text (into the console - System.out): Invalid Value
        printConversion(25.42); // should print the following text (into the console - System.out): 25.42 km/h = 16 mi/h
        printConversion(75.114); // should print the following text (into the console - System.out): 75.114 km/h = 47 mi/h
*/
        // Exercise 2 - MegaBytes Converter
/*
        printMegaBytesAndKiloBytes(2500); // should print the following text: "2500 KB = 2 MB and 452 KB"
        printMegaBytesAndKiloBytes(-1024); // should print the following text: "Invalid Value" because parameter is less than 0.
        printMegaBytesAndKiloBytes(5000); // should print the following text: "5000 KB = 4 MB and 904 KB"
*/
        // Exercise 3 - Barking Dog
/*
        System.out.println(shouldWakeUp(true, 1)); // should return true
        System.out.println(shouldWakeUp(false, 2)); // should return false since the dog is not barking.
        System.out.println(shouldWakeUp(true, 8)); // should return false, since it's not before 8.
        System.out.println(shouldWakeUp(true, -1)); // should return false since the hourOfDay parameter needs to be in a range 0-23.
*/
        // Exercise 4 - Leap Year Calculator
/*
        System.out.println(isLeapYear(-1600)); // should return false since the parameter is not in range (1-9999)
        System.out.println(isLeapYear(1600)); // should return true since 1600 is a leap year
        System.out.println(isLeapYear(2017)); // should return false since 2017 is not a leap year
        System.out.println(isLeapYear(2000)); // should return true because 2000 is a leap year
*/
        // Exercise 5 - Decimal Comparator
/*
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175)); // should return true since numbers are equal up to 3 decimal places.
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176)); // should return false since numbers are not equal up to 3 decimal places
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0)); // should return true since numbers are equal up to 3 decimal places.
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123)); // should return false since numbers are not equal up to 3 decimal places.
        System.out.println(areEqualByThreeDecimalPlaces(3.174, 3.175)); // should return false since numbers are not equal up to 3 decimal places.
*/
        // Exercise 6 - Equal Sum Checker
/*
        System.out.println(hasEqualSum(1, 1, 1)); // should return false since 1 + 1 is not equal to 1
        System.out.println(hasEqualSum(1, 1, 2)); // should return true since 1 + 1 is equal to 2
        System.out.println(hasEqualSum(1, -1, 0)); // should return true since 1 + (-1) is 1 - 1 and is equal to 0
*/
    }
}
