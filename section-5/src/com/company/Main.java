package com.company;

import static com.company.ex12_NumberInWord.printNumberInWord;
import static com.company.ex13_NumberOfDaysInMonth.getDaysInMonth;
import static com.company.ex14_SumOddRange.sumOdd;

public class Main {

    public static void main(String[] args) {
        // Exercise 12 - Number In Word
/*
        printNumberInWord(1);
        printNumberInWord(5);
        printNumberInWord(1123);
        printNumberInWord(-1);
*/
        // Exercise 13 - Exercise 13: Number Of Days In Month
/*
        System.out.println(getDaysInMonth(1, 2020)); // should return 31 since January has 31 days.
        System.out.println(getDaysInMonth(2, 2020)); // should return 29 since February has 29 days in a leap year and 2020 is a leap year.
        System.out.println(getDaysInMonth(2, 2018)); // should return 28 since February has 28 days if it's not a leap year and 2018 is not a leap year.
        System.out.println(getDaysInMonth(-1, 2020)); // should return -1 since the parameter month is invalid.
        System.out.println(getDaysInMonth(1, -2020)); // should return -1 since the parameter year is outside the range of 1 to 9999.
*/
        // Exercise 14 - Sum Odd
 /*
        System.out.println(sumOdd(1, 100)); // should return 2500
        System.out.println(sumOdd(-1, 100)); // should return -1
        System.out.println(sumOdd(100, 100)); // should return 0
        System.out.println(sumOdd(13, 13)); // should return 13 (This set contains one number, 13, and it is odd)
        System.out.println(sumOdd(100, -100)); // should return -1
        System.out.println(sumOdd(100, 1000)); // should return 247500
 */
    }
}
