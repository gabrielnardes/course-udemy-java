package com.company;

import static com.company.ex1_SpeedConverter.printConversion;
import static com.company.ex1_SpeedConverter.toMilesPerHour;
import static com.company.ex2_MegaBytesConverter.printMegaBytesAndKiloBytes;
import static com.company.ex3_BarkingDog.shouldWakeUp;
import static com.company.ex4_LeapYear.isLeapYear;
import static com.company.ex5_DecimalComparator.areEqualByThreeDecimalPlaces;
import static com.company.ex6_EqualSumChecker.hasEqualSum;
import static com.company.ex7_TeenNumberChecker.hasTeen;
import static com.company.ex7_TeenNumberChecker.isTeen;
import static com.company.ex8_AreaCalculator.area;
import static com.company.ex9_MinutesToYearsDaysCalculator.printYearsAndDays;

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
        // Exercise 7 - Teen Number Checker
/*
        System.out.println(hasTeen(9, 99, 19)); // should return true since 19 is in range 13 - 19
        System.out.println(hasTeen(23, 15, 42)); // should return true since 15 is in range 13 - 19
        System.out.println(hasTeen(22, 23, 34)); // should return false since numbers 22, 23, 34 are not in range 13-19
        System.out.println(isTeen(9)); // should return false since 9 is in not range 13 - 19
        System.out.println(isTeen(13)); // should return true since 13 is in range 13 - 19
*/
        // Exercise 8 - Area Calculator
/*
        System.out.println(area(5.0)); // should return 78.53975
        System.out.println(area(-1)); // should return -1 since the parameter is negative
        System.out.println(area(5.0, 4.0)); // should return 20.0 (5 * 4 = 20)
        System.out.println(area(-1.0, 4.0)); // should return -1 since first the parameter is negative
*/
        // Exercise 9 - Minutes To Years and Days Calculator
/*
        printYearsAndDays(525600); // should print "525600 min = 1 y and 0 d"
        printYearsAndDays(1051200); // should print "1051200 min = 2 y and 0 d"
        printYearsAndDays(561600); // should print "561600 min = 1 y and 25 d"
*/
    }
}
