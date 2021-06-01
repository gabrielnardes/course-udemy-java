package section4;

import static section4.ex1_SpeedConverter.printConversion;
import static section4.ex1_SpeedConverter.toMilesPerHour;
import static section4.ex2_MegaBytesConverter.printMegaBytesAndKiloBytes;
import static section4.ex3_BarkingDog.shouldWakeUp;
import static section4.ex4_LeapYear.isLeapYear;
import static section4.ex5_DecimalComparator.areEqualByThreeDecimalPlaces;
import static section4.ex6_EqualSumChecker.hasEqualSum;
import static section4.ex7_TeenNumberChecker.hasTeen;
import static section4.ex7_TeenNumberChecker.isTeen;
import static section4.ex8_AreaCalculator.area;
import static section4.ex9_MinutesToYearsDaysCalculator.printYearsAndDays;
import static section4.ex10_IntEqualityPrinter.printEqual;
import static section4.ex11_PlayingCat.isCatPlaying;

public class Section4 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
        ex7();
        ex8();
        ex9();
        ex10();
        ex11();
    }

    private static void ex1() {
        System.out.println("\nExercise 1 - Speed Converter - Section 4");
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
}

    private static void ex2() {
        System.out.println("\nExercise 2 - MegaBytes Converter - Section 4");
        printMegaBytesAndKiloBytes(2500); // should print the following text: "2500 KB = 2 MB and 452 KB"
        printMegaBytesAndKiloBytes(-1024); // should print the following text: "Invalid Value" because parameter is less than 0.
        printMegaBytesAndKiloBytes(5000); // should print the following text: "5000 KB = 4 MB and 904 KB"
    }

    private static void ex3() {
        System.out.println("\nExercise 3 - Barking Dog - Section 4");
        System.out.println(shouldWakeUp(true, 1)); // should return true
        System.out.println(shouldWakeUp(false, 2)); // should return false since the dog is not barking.
        System.out.println(shouldWakeUp(true, 8)); // should return false, since it's not before 8.
        System.out.println(shouldWakeUp(true, -1)); // should return false since the hourOfDay parameter needs to be in a range 0-23.
    }

    private static void ex4() {
        System.out.println("\nExercise 4 - Leap Year Calculator - Section 4");
        System.out.println(isLeapYear(-1600)); // should return false since the parameter is not in range (1-9999)
        System.out.println(isLeapYear(1600)); // should return true since 1600 is a leap year
        System.out.println(isLeapYear(2017)); // should return false since 2017 is not a leap year
        System.out.println(isLeapYear(2000)); // should return true because 2000 is a leap year
    }

    private static void ex5() {
        System.out.println("\nExercise 5 - Decimal Comparator - Section 4");
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175)); // should return true since numbers are equal up to 3 decimal places.
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176)); // should return false since numbers are not equal up to 3 decimal places
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0)); // should return true since numbers are equal up to 3 decimal places.
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123)); // should return false since numbers are not equal up to 3 decimal places.
        System.out.println(areEqualByThreeDecimalPlaces(3.174, 3.175)); // should return false since numbers are not equal up to 3 decimal places.
    }

    private static void ex6() {
        System.out.println("\nExercise 6 - Equal Sum Checker - Section 4");
        System.out.println(hasEqualSum(1, 1, 1)); // should return false since 1 + 1 is not equal to 1
        System.out.println(hasEqualSum(1, 1, 2)); // should return true since 1 + 1 is equal to 2
        System.out.println(hasEqualSum(1, -1, 0)); // should return true since 1 + (-1) is 1 - 1 and is equal to 0
    }

    private static void ex7() {
        System.out.println("\nExercise 7 - Teen Number Checker - Section 4");
        System.out.println(hasTeen(9, 99, 19)); // should return true since 19 is in range 13 - 19
        System.out.println(hasTeen(23, 15, 42)); // should return true since 15 is in range 13 - 19
        System.out.println(hasTeen(22, 23, 34)); // should return false since numbers 22, 23, 34 are not in range 13-19
        System.out.println(isTeen(9)); // should return false since 9 is in not range 13 - 19
        System.out.println(isTeen(13)); // should return true since 13 is in range 13 - 19
    }

    private static void ex8() {
        System.out.println("\nExercise 8 - Area Calculator - Section 4");
        System.out.println(area(5.0)); // should return 78.53975
        System.out.println(area(-1)); // should return -1 since the parameter is negative
        System.out.println(area(5.0, 4.0)); // should return 20.0 (5 * 4 = 20)
        System.out.println(area(-1.0, 4.0)); // should return -1 since first the parameter is negative
    }

    private static void ex9() {
        System.out.println("\nExercise 9 - Minutes To Years and Days Calculator - Section 4");
        printYearsAndDays(525600); // should print "525600 min = 1 y and 0 d"
        printYearsAndDays(1051200); // should print "1051200 min = 2 y and 0 d"
        printYearsAndDays(561600); // should print "561600 min = 1 y and 25 d"
    }

    private static void ex10() {
        System.out.println("\nExercise 10 - Equality Printer - Section 4");
        printEqual(1, 1, 1); // should print text All numbers are equal
        printEqual(1, 1, 2); // should print text Neither all are equal or different
        printEqual(-1, -1, -1); // should print text Invalid Value
        printEqual(1, 2, 3); // should print text All numbers are different
    }

    public static void ex11() {
        System.out.println("\nExercise 11 - Playing Cat - Section 4");
        System.out.println(isCatPlaying(true, 10)); // should return false since temperature is not in range 25 - 45
        System.out.println(isCatPlaying(false, 36)); // should return false since temperature is not in range 25 - 35 (summer parameter is false)
        System.out.println(isCatPlaying(false, 35)); // should return true since temperature is in range 25 - 35
    }
}
